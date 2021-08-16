package jp.co.netprotections.dto;
import lombok.Data;

@Data
public class MemberCandidateRequestDto {
	private String memberName;
	private int eventPlanning;
	private int cogitation;
	private int coordination;
	private int programmingAbility;
	private int infrastructureKnowledge;
	
	public int totalValue() {
		return eventPlanning + cogitation + coordination + programmingAbility + infrastructureKnowledge;
	}
}
