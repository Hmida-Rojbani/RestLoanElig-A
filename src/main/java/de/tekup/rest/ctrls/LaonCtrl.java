package de.tekup.rest.ctrls;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.rest.models.CustomerRequest;
import de.tekup.rest.models.WsResponse;
import de.tekup.rest.services.LoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class LaonCtrl {
	
	private LoanService service;
	
	@Operation(description = "Check client status for a credit.",operationId = "checkClient"
			,responses = {
					@ApiResponse(responseCode = "200", description = "Return Status"),
					@ApiResponse(responseCode = "400", description = "Not yet Implemented")
			})
	@PostMapping(path="/check/client/status",
			consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public WsResponse getStatus(@RequestBody CustomerRequest request) {
		return service.getLoanStatus(request);
	}
	
	@GetMapping("/test/service")
	public String ping() {
		return "hello";
	}
	@PutMapping("/test/service")
	public String ping1() {
		return "hello";
	}
	@DeleteMapping("/test/service")
	public String ping2() {
		return "hello";
	}

}
