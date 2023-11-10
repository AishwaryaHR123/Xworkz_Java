package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.BridgeDTO;

public class BridgeRunner {

	public static void main(String[] args) {
		System.out.println("Running main in BridgeRuner");
		BridgeDTO bridge1 = new BridgeDTO("Golden Gate", 2737, "Suspension", 1937);
        BridgeDTO bridge2 = new BridgeDTO("Brooklyn", 1595, "Suspension", 1883);
        BridgeDTO bridge3 = new BridgeDTO("Sydney Harbour", 1149, "Arch", 1932);
        BridgeDTO bridge4 = new BridgeDTO("Tower Bridge", 244, "Suspension", 1894);
        BridgeDTO bridge5 = new BridgeDTO("Golden Gate", 2737, "Suspension", 1937);
        BridgeDTO bridge6 = new BridgeDTO("Millau Viaduct", 2460, "Cable-stayed", 2004);
        BridgeDTO bridge7 = new BridgeDTO("Rialto Bridge", 48, "Arch", 1591);
        
        Collection<BridgeDTO> bridgCollection=new HashSet<BridgeDTO>();
        bridgCollection.add(bridge1);
        bridgCollection.add(bridge2);
        bridgCollection.add(bridge3);
        bridgCollection.add(bridge4);
        bridgCollection.add(bridge5);
        bridgCollection.add(bridge6);
        bridgCollection.add(bridge7);
        System.out.println("Total Bridges: "+bridgCollection.size());

	}

}
