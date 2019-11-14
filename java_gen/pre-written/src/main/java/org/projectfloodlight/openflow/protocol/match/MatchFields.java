package org.projectfloodlight.openflow.protocol.match;

// MUST BE ORDERED BY THE ORDER OF OF SPEC!!!
public enum MatchFields {
    // if present, PacketType must appear as the first OXM in the list (OF 1.5., 7.2.3.11)
    PACKET_TYPE,
    IN_PORT,
    IN_PHY_PORT,
    METADATA,
    ETH_DST,
    ETH_SRC,
    ETH_TYPE,
    VLAN_VID,
    VLAN_PCP,
    IP_DSCP,
    IP_ECN,
    IP_PROTO,
    IPV4_SRC,
    IPV4_DST,
    TCP_SRC,
    TCP_DST,
    UDP_SRC,
    UDP_DST,
    SCTP_SRC,
    SCTP_DST,
    ICMPV4_TYPE,
    ICMPV4_CODE,
    ARP_OP,
    ARP_SPA,
    ARP_TPA,
    ARP_SHA,
    ARP_THA,
    IPV6_SRC,
    IPV6_DST,
    IPV6_FLABEL,
    ICMPV6_TYPE,
    ICMPV6_CODE,
    IPV6_ND_TARGET,
    IPV6_ND_SLL,
    IPV6_ND_TLL,
    MPLS_LABEL,
    MPLS_TC,
    MPLS_BOS,
    TUNNEL_ID,
    CONNTRACK_STATE,
    CONNTRACK_ZONE,
    CONNTRACK_MARK,
    CONNTRACK_LABEL,
    IPV6_EXTHDR,
    PBB_UCA,
    TCP_FLAGS,
    OVS_TCP_FLAGS,
    ACTSET_OUTPUT,
    TUNNEL_IPV4_SRC,
    TUNNEL_IPV4_DST,
    TUNNEL_IPV6_SRC,
    TUNNEL_IPV6_DST,
    BSN_IN_PORTS_128,
    BSN_IN_PORTS_512,
    BSN_LAG_ID,
    BSN_VRF,
    BSN_GLOBAL_VRF_ALLOWED,
    BSN_L3_INTERFACE_CLASS_ID,
    BSN_L3_SRC_CLASS_ID,
    BSN_L3_DST_CLASS_ID,
    BSN_EGR_PORT_GROUP_ID,
    BSN_UDF0,
    BSN_UDF1,
    BSN_UDF2,
    BSN_UDF3,
    BSN_UDF4,
    BSN_UDF5,
    BSN_UDF6,
    BSN_UDF7,
    BSN_TCP_FLAGS,
    BSN_VLAN_XLATE_PORT_GROUP_ID,
    BSN_L2_CACHE_HIT,
    BSN_INGRESS_PORT_GROUP_ID,
    BSN_VXLAN_NETWORK_ID,
    BSN_INNER_ETH_DST,
    BSN_INNER_ETH_SRC,
    BSN_INNER_VLAN_VID,
    BSN_VFI,
    OCH_SIGTYPE,
    OCH_SIGTYPE_BASIC,
    OCH_SIGID,
    OCH_SIGID_BASIC,
    OCH_SIGATT,
    OCH_SIGATT_BASIC,
    EXP_ODU_SIG_ID,
    EXP_ODU_SIGTYPE,
    EXP_OCH_SIG_ID,
    EXP_OCH_SIGTYPE,
    REG0,
    REG1,
    REG2,
    REG3,
    REG4,
    REG5,
    REG6,
    REG7,
    NSP,
    NSI,
    NSH_C1,
    NSH_C2,
    NSH_C3,
    NSH_C4,
    NSH_MDTYPE,
    NSH_NP,
    ENCAP_ETH_SRC,
    ENCAP_ETH_DST,
    ENCAP_ETH_TYPE,
    TUN_FLAGS,
    TUN_GBP_ID,
    TUN_GBP_FLAGS,
    TUN_GPE_NP,
    TUN_GPE_FLAGS,
    OFDPA_VRF,
    OFDPA_QOS_INDEX,
    OFDPA_MPLS_TYPE,
    OFDPA_MPLS_L2_PORT,
    OFDPA_OVID,
    OFDPA_ACTSET_OUTPUT,
    OFDPA_ALLOW_VLAN_TRANSLATION,
    BSN_IP_FRAGMENTATION
}
