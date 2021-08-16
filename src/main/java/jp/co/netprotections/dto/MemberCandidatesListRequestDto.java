package jp.co.netprotections.dto;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class MemberCandidatesListRequestDto {
	private List<MemberCandidateRequestDto> memberCandidatesListRequest;
	
	public MemberCandidatesListRequestDto() {
		memberCandidatesListRequest = new ArrayList<MemberCandidateRequestDto>();
	}
	
	public MemberCandidateRequestDto getMemberCandidateData(int index) {
		return memberCandidatesListRequest.get(index);
	}
	
	public void addJudgedCandidate(MemberCandidateRequestDto request) {
		memberCandidatesListRequest.add(request);
	}
}
