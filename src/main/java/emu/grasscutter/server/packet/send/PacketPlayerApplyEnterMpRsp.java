package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.PlayerApplyEnterMpRspOuterClass.PlayerApplyEnterMpRsp;

public class PacketPlayerApplyEnterMpRsp extends BasePacket {

    public PacketPlayerApplyEnterMpRsp(int targetUid) {
        super(PacketOpcodes.PlayerApplyEnterMpRsp);

        PlayerApplyEnterMpRsp proto =
                PlayerApplyEnterMpRsp.newBuilder().setTargetUid(targetUid).build();

        this.setData(proto);
    }
}
