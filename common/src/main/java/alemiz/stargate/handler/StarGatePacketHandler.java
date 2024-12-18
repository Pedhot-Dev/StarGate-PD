/*
 * Copyright 2020 Alemiz
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package alemiz.stargate.handler;

import alemiz.stargate.protocol.*;

public interface StarGatePacketHandler {

    default boolean handleHandshake(HandshakePacket packet) {
        return false;
    }

    default boolean handleServerHandshake(ServerHandshakePacket packet) {
        return false;
    }

    default boolean handleDisconnect(DisconnectPacket packet){
        return false;
    }

    default boolean handlePing(PingPacket packet){
        return false;
    }

    default boolean handlePong(PongPacket packet){
        return false;
    }

    default boolean handleReconnect(ReconnectPacket packet){
        return false;
    }

    default boolean handleForwardPacket(ForwardPacket packet){
        return false;
    }

    default boolean handleServerInfoRequest(ServerInfoRequestPacket packet) {
        return false;
    }

    default boolean handleServerInfoResponse(ServerInfoResponsePacket packet) {
        return false;
    }

    default boolean handleMessageRequest(MessageRequestPacket packet) {
        return false;
    }

    default boolean handleMessageResponse(MessageResponsePacket packet) {
        return false;
    }

    default boolean handleServerTransfer(ServerTransferPacket packet) {
        return false;
    }

    default boolean handlePlayerPingRequest(PlayerPingRequestPacket packet) {
        return false;
    }

    default boolean handlePlayerPingResponse(PlayerPingResponsePacket packet) {
        return false;
    }

    default boolean handleServerManage(ServerManagePacket packet) {
        return false;
    }

    default boolean handleUnknown(UnknownPacket packet) {
        return false;
    }
}
