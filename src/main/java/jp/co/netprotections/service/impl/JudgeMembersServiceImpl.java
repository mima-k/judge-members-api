package jp.co.netprotections.service.impl;

import org.springframework.stereotype.Service;
import jp.co.netprotections.service.JudgeMembersService;
import jp.co.netprotections.dto.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class JudgeMembersServiceImpl implements JudgeMembersService {
	@Override
	public boolean judgeMemberCandidate(MemberCandidateRequestDto request) {
		if(request.getEventPlanning() <= 1) {
			return false;
		} else if(request.getCogitation() <= 1) {
			return false;
		} else if(request.getCoordination() <= 1) {
			return false;
		} else if(request.totalValue() <= 10) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public MemberCandidatesListResponseDto judgedResult(MemberCandidatesListRequestDto listRequest) {
		List<MemberCandidateResponseDto> judgedMembersList = new ArrayList<MemberCandidateResponseDto>();
		MemberCandidatesListResponseDto listResponse = new MemberCandidatesListResponseDto();
		for(int i = 0; i < listRequest.getMemberCandidatesListRequest().size(); i++) {
			MemberCandidateResponseDto response = new MemberCandidateResponseDto();
			MemberCandidateRequestDto request = listRequest.getMemberCandidateData(i);
			response.setMemberName(request.getMemberName());
			response.setEnlistedPropriety(judgeMemberCandidate(request));
			judgedMembersList.add(response);
		}
		listResponse.setMemberCandidatesListResponse(judgedMembersList);
		return listResponse;
	}
}
