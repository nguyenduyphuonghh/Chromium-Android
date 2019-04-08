
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/p2p_trusted.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface P2pTrustedSocketManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends P2pTrustedSocketManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<P2pTrustedSocketManager, P2pTrustedSocketManager.Proxy> MANAGER = P2pTrustedSocketManager_Internal.MANAGER;


    void startRtpDump(
boolean incoming, boolean outgoing);



    void stopRtpDump(
boolean incoming, boolean outgoing);


}