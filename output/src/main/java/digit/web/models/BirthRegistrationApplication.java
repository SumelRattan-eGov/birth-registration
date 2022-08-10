package digit.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * A Object holds the basic data for a Birth Registration Application
 */
@ApiModel(description = "A Object holds the basic data for a Birth Registration Application")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2022-07-26T12:39:05.988+05:30")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BirthRegistrationApplication   {

        @JsonProperty("id")
        private String id = null;

        @JsonProperty("tenantId")
        private String tenantId = null;

        @JsonProperty("applicationNumber")
        private String applicationNumber = null;

        @JsonProperty("babyFirstName")
        private String babyFirstName = null;

        @JsonProperty("babyLastName")
        private String babyLastName = null;

        @JsonProperty("fatherName")
        private String fatherName = null;

        @JsonProperty("motherName")
        private String motherName = null;

        @JsonProperty("doctorName")
        private String doctorName = null;

        @JsonProperty("hospitalName")
        private String hospitalName = null;

        @JsonProperty("placeOfBirth")
        private String placeOfBirth = null;

        @JsonProperty("timeOfBirth")
        private Integer timeOfBirth = null;

        @JsonProperty("address")
        private Address address = null;

        @JsonProperty("auditDetails")
        private AuditDetails auditDetails = null;

        @JsonProperty("applicantMobileNumber")
        private String applicantMobileNumber = null;

        @JsonProperty("userName")
        private String userName = null;

        @JsonProperty("password")
        private String password = null;

        @JsonProperty("gender")
        private String gender = null;

        @JsonProperty("emailId")
        private String emailId = null;

        @JsonProperty("altContactNumber")
        private String altContactNumber = null;

        @JsonProperty("permanentAddress")
        private String permanentAddress = null;

        @JsonProperty("permanentCity")
        private String permanentCity = null;

        @JsonProperty("permanentPincode")
        private String permanentPincode = null;

        @JsonProperty("correspondenceCity")
        private String correspondenceCity = null;

        @JsonProperty("correspondencePincode")
        private String correspondencePincode = null;

        @JsonProperty("correspondenceAddress")
        private String correspondenceAddress = null;

        @JsonProperty("active")
        private Boolean active = null;

        @JsonProperty("locale")
        private String locale = null;

        @JsonProperty("type")
        private String type = null;

        @JsonProperty("signature")
        private String signature = null;

        @JsonProperty("accountLocked")
        private Boolean accountLocked = null;

        @JsonProperty("fatherOrHusbandName")
        private String fatherOrHusbandName = null;

        @JsonProperty("bloodGroup")
        private String bloodGroup = null;

        @JsonProperty("identificationMark")
        private String identificationMark = null;

        @JsonProperty("salutation")
        private String salutation = null;

        @JsonProperty("photo")
        private String photo = null;

//        @JsonProperty("userid")
//        private String userId = null;

        @JsonProperty("otpReference")
        private String otpReference = null;

        @Valid
        @JsonProperty("workflow")
        private Workflow workflow = null;

}

