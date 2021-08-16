package jp.co.netprotections.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class MemberCandidatesListResponseDto {
	private List<MemberCandidateResponseDto> memberCandidatesListResponse = new ArrayList<MemberCandidateResponseDto>();
	
	public MemberCandidatesListResponseDto() {
		memberCandidatesListResponse = new ArrayList<MemberCandidateResponseDto>();
	}
}
