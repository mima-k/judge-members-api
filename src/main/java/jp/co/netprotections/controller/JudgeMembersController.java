package jp.co.netprotections.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import jp.co.netprotections.service.JudgeMembersService;
import jp.co.netprotections.dto.*;

@RestController
public class JudgeMembersController {
	@Autowired
	private JudgeMembersService judgeMembersService;
	
	@RequestMapping(value = "/api", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public MemberCandidatesListResponseDto execute(@RequestBody MemberCandidatesListRequestDto request) {
		return judgeMembersService.judgedResult(request);
	}
}
