class KSRTCRunner
{
	public static void main(String [] ref)
	{
		KSRTC.buses = 12000;
		KSRTC.regNo = 76895334l;
		KSRTC.grade = 'B';
		KSRTC.revenue = 786500000.7678;
		KSRTC.ticketPrice =696.88f ;
		KSRTC.isGovernment = true;
		KSRTC.headOffice = "bangalore";
		
		KSRTC.bus();
		
	}
}