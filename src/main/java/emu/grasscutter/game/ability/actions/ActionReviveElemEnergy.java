package emu.grasscutter.game.ability.actions;

import com.google.protobuf.ByteString;
import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.entity.EntityAvatar;
import emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason;
import emu.grasscutter.server.packet.send.PacketEntityFightPropUpdateNotify;
import emu.grasscutter.server.packet.send.PacketEntityFightPropChangeReasonNotify;
import emu.grasscutter.net.proto.ChangeEnergyReasonOuterClass.ChangeEnergyReason;

import emu.grasscutter.game.entity.GameEntity;

@AbilityAction(AbilityModifierAction.Type.ReviveElemEnergy)
public final class ActionReviveElemEnergy extends AbilityActionHandler {
    @Override
    public boolean execute(
            Ability ability, AbilityModifierAction action, ByteString abilityData, GameEntity target) {
                Grasscutter.getLogger().info("ReviveElemEnergy");
        float ratio = action.ratio.get(ability);
        if (target instanceof EntityAvatar avatar) {
        float curEnergy = avatar.getFightProperty(avatar.getAvatar().getSkillDepot().getElementType().getCurEnergyProp());
        float newEnergy;
        if (ratio < 0) {
            newEnergy = curEnergy - ratio; // -(-x) = +x → Falls negativ, dann addieren
        } else {
            newEnergy = curEnergy + ratio; // Normaler Additionsfall
        }
    
    
        avatar.getAvatar().setCurrentEnergy(avatar.getAvatar().getSkillDepot().getElementType().getCurEnergyProp(), newEnergy);
        avatar.getScene().broadcastPacket(new PacketEntityFightPropUpdateNotify(avatar, avatar.getAvatar().getSkillDepot().getElementType().getCurEnergyProp()));
        avatar.getScene().broadcastPacket(new PacketEntityFightPropChangeReasonNotify(avatar, avatar.getAvatar().getSkillDepot().getElementType().getCurEnergyProp(), newEnergy, PropChangeReason.PROP_CHANGE_REASON_ABILITY, ChangeEnergyReason.CHANGE_ENERGY_REASON_ABILITY));
        Grasscutter.getLogger().info("Revived avatar energy by " + ratio);

        if (action == null) {
            return false;
        }
    
    }
        return true;
    }
}
