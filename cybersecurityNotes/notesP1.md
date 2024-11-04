-modulator-demodulator
-converting signals
-cable standard 
-Residences:1
-Connects LAN to WAN
Local Area Network 


Wide Area Network

Types of modems
-analog-(one stream) 66 kbps
-DSL (100 mbps) 5-50 in reality
-Cable (standard) 16bps (100-300 mbps)
-Fiber optic -thin as hair- 16bps to 106 bps

Modems
-device that connects the service of Internet from your ISP
-connect your Lan to the WAn (Wide Area  Network)
-Modulation/Demodulation
-converting analog to digital signal
-digtializions

-Anolong
One date stream (one person use at a time)
Analog - 56kps
-Integrated service Digital network (ISDN) (DSL used a telephone line)
3 DATA STREAMS
Fast 128 kbps
Dial up
Out of date/contimeution
-digital subscriber line (DSL)
Phones different frequencies 
Freely call, use the Internet, watch TV.
100 mbps (more like 5-50 mbps)
Physical location of the Isp Tors
-cables social bales
Improvement over DSL
16 bps
25 mbps -200/300 mbps
Speed varies depending on who is on at any given time (At home +ISP)
 Most common is this and DSL
-fiber Optic
Glass strands
Electric pulses/light
16 bps residents (more like 50-1000 mbps)
10 Gbps-Business 
Fiber, snapes easier 
Very expensive
40% of pop has fiber 


Modem Layout
-three ports
Power supply\
Internet 
-Router 
-Isp provides integrated routers 
If a piece is broken/missing becomes useless
-better to buy router 
-Decodes signals from ISP
-connect direct to Internet

CONS
-speeds dependent on plan from ISP
-only one port, can’t connect to wireless dives 
-doesn’t provide WiFi
- can’t create a local network

Router Brands
-Netgear*
-At&T
-Cisco
-Linksys*
-Google
-Ubiquiti
TP-Link*


Router 
-Routes
-Distributes traffic for wined + wireless devices
-Device gets assigned an IP address 
Most rediental (192.168.1.1-255)







What is a Router 9/21

-Connects devices
-roues our connect
-3-4 ports internet-wan	lan-pc	lan-wisels pc	lan-media servers	lan-switch 
- creates you wifi network

Routers
Main reasons
-all your devices cab connect and reach outside you network 

Wan-wide area network
LAN-Local area network
Antennas-send out signals

Router-192.169.1.1

RB Functions 
-IP address  distribution
	-unique private IP address (home network)
-packet routing 
-fire wall
- protects you from threats 
- Sets rules for your devices
-blocks unauthorized access


Types of Routers
-Home routers
	-Netgear,  Linksys, Arries, TP-Link
-Enterprise Router- Businesses
	-cpu, cache, memory
	-better NAT
	-Allows around 50-150 to be connected without loss 
	Cisco, Ubiquiti, Ruckus, 
-Wireless routers
	-no wire or mash
-Travel Router


BOOTP (manually)
Router Works
-device connects to the router 
-DHCP Host dicoryavy- deciding what ip the device ashould get
-offer an IP to be leased 
-Device request IP\
- router will cable what IP is available for that device
-DHCP- dynamic host configuration protocol 
-device makes a choice 
-dhcp acknowledgement configuration
	-


Wifi-Settings
-SSID- Service set Indenitifacon
	-home network
-BSSID-mac identifier 
Encryption- WPAZ -standard
	-wpa
	-wep

9/25
DHCP-Dynamic Host Configuration Protocol
-Automatically assigns an ip address
		-can set Ip address
		- address in’t taken
		-router Ip is=192.168.1.1
		-Dns=192.168.1.1
		-interfactvame 
Interface
Wlan0			interface wlan0 
Eth0			static ip address= 192.168.1.137/24
				Static router = 192.168.1.1
				Static dns server= 192.168.1.1	8888
-Request for Ip,discorary request
-DHCPcomes back with IP available
-Device selects one, additional 


Network Encryption
-UNEP
not safe
Vulnerable
-WPAR
Standard
Automatic
AES Encryption
Pre-shared key for authorization
-WPA3-Simultaneous Authentication of equals (SAE) 


(difference between WPA3 and WPA2 is the SAE and AES)





PainText		      Encryption
Password1234!------------> SHAI		-> ah173q*!14sZ235QR


2.4G vs 5G
-2.4G lower than 5 on electromagnetic spectrum 
-2.4G can penetrate walls 
-2.4 is good range
-5G is less crowded than 2.4G non Wifi devices
-5Gmore channels for 


Troubleshooting
-slow connection
-hardware issues (antems, anent, plug)
-ISP throttle (128 kbps)
-high Ping-1000-400-200-100(starts to be noticeable)
-Packet loss
-network Congestion
--Dns resolution problems 

Router work
-Packets
-Packets comes in
	-Routing/DecisionTable
	-packet has Ip address header destination+sends it out 
-router table consulting interface + protocols for forwarding (TCP vs UDP)
-ARP (address resolution protocol)
-Ip destination IPp is on a different network or sunset neither MAC

-network address translation
	-protecting private Ip address when requesting info
-multiple private IP address
	-i public Ip 
-device hits router, router router uses WAn + router acts as translator 
-packets comes back changes the source Ip of the packet head to the destination IP
- public ip the of the router 
-reverse translation

Router Setup
-Router setting 
-change admin (name + password)
-change name of SSID
-change password of SSID
-guest Network-password protected
-inspect all devices on network
-Firewall whitelisting
-limiting users
-scumbling mac address 


10/23 pi
192.168.1

Public Ip-1
Private Ip as many as you want 

Eth0-ethernet (wired)
 
Port 	22-ssh
	24
	45

Ports- 65,535
(total)
	-3000 (default port for server)

Firewall
-(sate/barrier for your ports)


Open
Closed
Established
Listening 


10/31 adding people to pi
-Sudo-admin privilege 
-Sudo adduser guest sudo
-sudo
-sudo permissions- duo adduser guest sudo
Removes user- sudo userdel username
Deltetes group - dudo groupdel group 

11/6 quiz review 
-ifconfig
0ip address 
-hostname -I
0ccommanon residence network range- 192.168.1.0/24
-home network-class c
0username command0 whoami
Wlan)-wifi connection
Eth0-wired connection
Inet0 Internet concoction 
sudo apt update-gathers information on what packages need to be upgraded.
- sudo apt upgrade-Downloads and installs the most recent packages.

Link to quiz https://docs.google.com/forms/d/e/1FAIpQLSfqwuwwppLtgNMXfSMhHHNXlRYG4Hx54lERCajSoamuQY440A/viewscore?viewscore=AE0zAgCT_WLscQDX4oB6xU11iP2t4GvBkcBoqGJP4NduD8IVbVl_Xktbajl3AR6m7w 



11/13 Adding new user to pi

Go into pi

sudo adduser username
	New user +group will appear
-create password
-verify info for user

sudo usermod -aG sudo groupname
Adult price -medistying the user -appending user to group is the don’t exit user to add - group to add 
Switching to user 
Sudo username


Permissions 
-read-4
-write -2
-execute-1
-chmod -777


12/12 Firewall notes 

Most breaches 
-Misconfiguations 95 percent of breaches form that 

Consequences from misconfigurations
-unintended openings 
-data breach
-ransomware 
-repgoes down
-penalty for regulations 

Causes the Misconfigurations
-Human Error 
-Lack of Documentation (not updated)
-Complex (much harder for huge corporations, different networks)
-Inadequate training 
-Rule Duplication 

Real World Examples 
Target 2013
Equifax 2017 (147 million, misconfigured Apache frameworks)

Ways to Prevent 
ACL Access Control Lists
Training 
Documentation
Audits 

Keys to Firewalls 
Packet Filtering (ip address Source and Destination, ports , pratocals, information 


More Firewalls notes ¼

-Lack of docs 
Hyman error
Complex
Misconfiguration 
