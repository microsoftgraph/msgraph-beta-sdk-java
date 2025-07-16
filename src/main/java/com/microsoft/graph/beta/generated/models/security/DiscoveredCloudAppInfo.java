package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscoveredCloudAppInfo extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DiscoveredCloudAppInfo} and sets the default values.
     */
    public DiscoveredCloudAppInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscoveredCloudAppInfo}
     */
    @jakarta.annotation.Nonnull
    public static DiscoveredCloudAppInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscoveredCloudAppInfo();
    }
    /**
     * Gets the csaStarLevel property value. The csaStarLevel property
     * @return a {@link AppInfoCsaStarLevel}
     */
    @jakarta.annotation.Nullable
    public AppInfoCsaStarLevel getCsaStarLevel() {
        return this.backingStore.get("csaStarLevel");
    }
    /**
     * Gets the dataAtRestEncryptionMethod property value. The dataAtRestEncryptionMethod property
     * @return a {@link AppInfoDataAtRestEncryptionMethod}
     */
    @jakarta.annotation.Nullable
    public AppInfoDataAtRestEncryptionMethod getDataAtRestEncryptionMethod() {
        return this.backingStore.get("dataAtRestEncryptionMethod");
    }
    /**
     * Gets the dataCenter property value. Indicates the countries or regions in which your data center resides.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataCenter() {
        return this.backingStore.get("dataCenter");
    }
    /**
     * Gets the dataRetentionPolicy property value. The dataRetentionPolicy property
     * @return a {@link AppInfoDataRetentionPolicy}
     */
    @jakarta.annotation.Nullable
    public AppInfoDataRetentionPolicy getDataRetentionPolicy() {
        return this.backingStore.get("dataRetentionPolicy");
    }
    /**
     * Gets the dataTypes property value. Indicates the data types that an end user can upload to the app. The possible values are: documents, mediaFiles, codingFiles, creditCards, databaseFiles, none, unknown, unknownFutureValue.
     * @return a {@link java.util.List<AppInfoUploadedDataTypes>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppInfoUploadedDataTypes> getDataTypes() {
        return this.backingStore.get("dataTypes");
    }
    /**
     * Gets the domainRegistrationDateTime property value. Indicates the date when the app domain was registered.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainRegistrationDateTime() {
        return this.backingStore.get("domainRegistrationDateTime");
    }
    /**
     * Gets the encryptionProtocol property value. The encryptionProtocol property
     * @return a {@link AppInfoEncryptionProtocol}
     */
    @jakarta.annotation.Nullable
    public AppInfoEncryptionProtocol getEncryptionProtocol() {
        return this.backingStore.get("encryptionProtocol");
    }
    /**
     * Gets the fedRampLevel property value. The fedRampLevel property
     * @return a {@link AppInfoFedRampLevel}
     */
    @jakarta.annotation.Nullable
    public AppInfoFedRampLevel getFedRampLevel() {
        return this.backingStore.get("fedRampLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("csaStarLevel", (n) -> { this.setCsaStarLevel(n.getEnumValue(AppInfoCsaStarLevel::forValue)); });
        deserializerMap.put("dataAtRestEncryptionMethod", (n) -> { this.setDataAtRestEncryptionMethod(n.getEnumValue(AppInfoDataAtRestEncryptionMethod::forValue)); });
        deserializerMap.put("dataCenter", (n) -> { this.setDataCenter(n.getStringValue()); });
        deserializerMap.put("dataRetentionPolicy", (n) -> { this.setDataRetentionPolicy(n.getEnumValue(AppInfoDataRetentionPolicy::forValue)); });
        deserializerMap.put("dataTypes", (n) -> { this.setDataTypes(n.getCollectionOfEnumValues(AppInfoUploadedDataTypes::forValue)); });
        deserializerMap.put("domainRegistrationDateTime", (n) -> { this.setDomainRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("encryptionProtocol", (n) -> { this.setEncryptionProtocol(n.getEnumValue(AppInfoEncryptionProtocol::forValue)); });
        deserializerMap.put("fedRampLevel", (n) -> { this.setFedRampLevel(n.getEnumValue(AppInfoFedRampLevel::forValue)); });
        deserializerMap.put("founded", (n) -> { this.setFounded(n.getIntegerValue()); });
        deserializerMap.put("gdprReadinessStatement", (n) -> { this.setGdprReadinessStatement(n.getStringValue()); });
        deserializerMap.put("headquarters", (n) -> { this.setHeadquarters(n.getStringValue()); });
        deserializerMap.put("holding", (n) -> { this.setHolding(n.getEnumValue(AppInfoHolding::forValue)); });
        deserializerMap.put("hostingCompany", (n) -> { this.setHostingCompany(n.getStringValue()); });
        deserializerMap.put("isAdminAuditTrail", (n) -> { this.setIsAdminAuditTrail(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isCobitCompliant", (n) -> { this.setIsCobitCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isCoppaCompliant", (n) -> { this.setIsCoppaCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isDataAuditTrail", (n) -> { this.setIsDataAuditTrail(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isDataClassification", (n) -> { this.setIsDataClassification(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isDataOwnership", (n) -> { this.setIsDataOwnership(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isDisasterRecoveryPlan", (n) -> { this.setIsDisasterRecoveryPlan(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isDmca", (n) -> { this.setIsDmca(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isFerpaCompliant", (n) -> { this.setIsFerpaCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isFfiecCompliant", (n) -> { this.setIsFfiecCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isFileSharing", (n) -> { this.setIsFileSharing(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isFinraCompliant", (n) -> { this.setIsFinraCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isFismaCompliant", (n) -> { this.setIsFismaCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGaapCompliant", (n) -> { this.setIsGaapCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprDataProtectionImpactAssessment", (n) -> { this.setIsGdprDataProtectionImpactAssessment(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprDataProtectionOfficer", (n) -> { this.setIsGdprDataProtectionOfficer(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprDataProtectionSecureCrossBorderDataTransfer", (n) -> { this.setIsGdprDataProtectionSecureCrossBorderDataTransfer(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprImpactAssessment", (n) -> { this.setIsGdprImpactAssessment(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprLawfulBasisForProcessing", (n) -> { this.setIsGdprLawfulBasisForProcessing(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprReportDataBreaches", (n) -> { this.setIsGdprReportDataBreaches(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightsRelatedToAutomatedDecisionMaking", (n) -> { this.setIsGdprRightsRelatedToAutomatedDecisionMaking(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToAccess", (n) -> { this.setIsGdprRightToAccess(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToBeInformed", (n) -> { this.setIsGdprRightToBeInformed(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToDataPortablility", (n) -> { this.setIsGdprRightToDataPortablility(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToErasure", (n) -> { this.setIsGdprRightToErasure(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToObject", (n) -> { this.setIsGdprRightToObject(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToRectification", (n) -> { this.setIsGdprRightToRectification(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprRightToRestrictionOfProcessing", (n) -> { this.setIsGdprRightToRestrictionOfProcessing(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGdprSecureCrossBorderDataControl", (n) -> { this.setIsGdprSecureCrossBorderDataControl(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isGlbaCompliant", (n) -> { this.setIsGlbaCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHipaaCompliant", (n) -> { this.setIsHipaaCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHitrustCsfCompliant", (n) -> { this.setIsHitrustCsfCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHttpSecurityHeadersContentSecurityPolicy", (n) -> { this.setIsHttpSecurityHeadersContentSecurityPolicy(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHttpSecurityHeadersStrictTransportSecurity", (n) -> { this.setIsHttpSecurityHeadersStrictTransportSecurity(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHttpSecurityHeadersXContentTypeOptions", (n) -> { this.setIsHttpSecurityHeadersXContentTypeOptions(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHttpSecurityHeadersXFrameOptions", (n) -> { this.setIsHttpSecurityHeadersXFrameOptions(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isHttpSecurityHeadersXXssProtection", (n) -> { this.setIsHttpSecurityHeadersXXssProtection(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isIpAddressRestriction", (n) -> { this.setIsIpAddressRestriction(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isIsae3402Compliant", (n) -> { this.setIsIsae3402Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isIso27001Compliant", (n) -> { this.setIsIso27001Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isIso27017Compliant", (n) -> { this.setIsIso27017Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isIso27018Compliant", (n) -> { this.setIsIso27018Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isItarCompliant", (n) -> { this.setIsItarCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isMultiFactorAuthentication", (n) -> { this.setIsMultiFactorAuthentication(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicy", (n) -> { this.setIsPasswordPolicy(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicyChangePasswordPeriod", (n) -> { this.setIsPasswordPolicyChangePasswordPeriod(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicyCharacterCombination", (n) -> { this.setIsPasswordPolicyCharacterCombination(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicyPasswordHistoryAndReuse", (n) -> { this.setIsPasswordPolicyPasswordHistoryAndReuse(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicyPasswordLengthLimit", (n) -> { this.setIsPasswordPolicyPasswordLengthLimit(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPasswordPolicyPersonalInformationUse", (n) -> { this.setIsPasswordPolicyPersonalInformationUse(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPenetrationTesting", (n) -> { this.setIsPenetrationTesting(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isPrivacyShieldCompliant", (n) -> { this.setIsPrivacyShieldCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isRememberPassword", (n) -> { this.setIsRememberPassword(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isRequiresUserAuthentication", (n) -> { this.setIsRequiresUserAuthentication(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSoc1Compliant", (n) -> { this.setIsSoc1Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSoc2Compliant", (n) -> { this.setIsSoc2Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSoc3Compliant", (n) -> { this.setIsSoc3Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSoxCompliant", (n) -> { this.setIsSoxCompliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSp80053Compliant", (n) -> { this.setIsSp80053Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSsae16Compliant", (n) -> { this.setIsSsae16Compliant(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isSupportsSaml", (n) -> { this.setIsSupportsSaml(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isTrustedCertificate", (n) -> { this.setIsTrustedCertificate(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isUserAuditTrail", (n) -> { this.setIsUserAuditTrail(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isUserCanUploadData", (n) -> { this.setIsUserCanUploadData(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isUserRolesSupport", (n) -> { this.setIsUserRolesSupport(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("isValidCertificateName", (n) -> { this.setIsValidCertificateName(n.getEnumValue(CloudAppInfoState::forValue)); });
        deserializerMap.put("latestBreachDateTime", (n) -> { this.setLatestBreachDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logonUrls", (n) -> { this.setLogonUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("pciDssVersion", (n) -> { this.setPciDssVersion(n.getEnumValue(AppInfoPciDssVersion::forValue)); });
        deserializerMap.put("vendor", (n) -> { this.setVendor(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the founded property value. Indicates the year that the specific app vendor was established.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFounded() {
        return this.backingStore.get("founded");
    }
    /**
     * Gets the gdprReadinessStatement property value. Indicates the GDPR readiness of the app in relation to policies app provides to safeguard personal user data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGdprReadinessStatement() {
        return this.backingStore.get("gdprReadinessStatement");
    }
    /**
     * Gets the headquarters property value. Indicates the location of the headquarters of the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeadquarters() {
        return this.backingStore.get("headquarters");
    }
    /**
     * Gets the holding property value. The holding property
     * @return a {@link AppInfoHolding}
     */
    @jakarta.annotation.Nullable
    public AppInfoHolding getHolding() {
        return this.backingStore.get("holding");
    }
    /**
     * Gets the hostingCompany property value. Indicates the company name that provides hosting services for the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHostingCompany() {
        return this.backingStore.get("hostingCompany");
    }
    /**
     * Gets the isAdminAuditTrail property value. The isAdminAuditTrail property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsAdminAuditTrail() {
        return this.backingStore.get("isAdminAuditTrail");
    }
    /**
     * Gets the isCobitCompliant property value. The isCobitCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsCobitCompliant() {
        return this.backingStore.get("isCobitCompliant");
    }
    /**
     * Gets the isCoppaCompliant property value. The isCoppaCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsCoppaCompliant() {
        return this.backingStore.get("isCoppaCompliant");
    }
    /**
     * Gets the isDataAuditTrail property value. The isDataAuditTrail property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsDataAuditTrail() {
        return this.backingStore.get("isDataAuditTrail");
    }
    /**
     * Gets the isDataClassification property value. The isDataClassification property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsDataClassification() {
        return this.backingStore.get("isDataClassification");
    }
    /**
     * Gets the isDataOwnership property value. The isDataOwnership property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsDataOwnership() {
        return this.backingStore.get("isDataOwnership");
    }
    /**
     * Gets the isDisasterRecoveryPlan property value. The isDisasterRecoveryPlan property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsDisasterRecoveryPlan() {
        return this.backingStore.get("isDisasterRecoveryPlan");
    }
    /**
     * Gets the isDmca property value. The isDmca property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsDmca() {
        return this.backingStore.get("isDmca");
    }
    /**
     * Gets the isFerpaCompliant property value. The isFerpaCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsFerpaCompliant() {
        return this.backingStore.get("isFerpaCompliant");
    }
    /**
     * Gets the isFfiecCompliant property value. The isFfiecCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsFfiecCompliant() {
        return this.backingStore.get("isFfiecCompliant");
    }
    /**
     * Gets the isFileSharing property value. The isFileSharing property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsFileSharing() {
        return this.backingStore.get("isFileSharing");
    }
    /**
     * Gets the isFinraCompliant property value. The isFinraCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsFinraCompliant() {
        return this.backingStore.get("isFinraCompliant");
    }
    /**
     * Gets the isFismaCompliant property value. The isFismaCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsFismaCompliant() {
        return this.backingStore.get("isFismaCompliant");
    }
    /**
     * Gets the isGaapCompliant property value. The isGaapCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGaapCompliant() {
        return this.backingStore.get("isGaapCompliant");
    }
    /**
     * Gets the isGdprDataProtectionImpactAssessment property value. The isGdprDataProtectionImpactAssessment property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprDataProtectionImpactAssessment() {
        return this.backingStore.get("isGdprDataProtectionImpactAssessment");
    }
    /**
     * Gets the isGdprDataProtectionOfficer property value. The isGdprDataProtectionOfficer property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprDataProtectionOfficer() {
        return this.backingStore.get("isGdprDataProtectionOfficer");
    }
    /**
     * Gets the isGdprDataProtectionSecureCrossBorderDataTransfer property value. The isGdprDataProtectionSecureCrossBorderDataTransfer property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprDataProtectionSecureCrossBorderDataTransfer() {
        return this.backingStore.get("isGdprDataProtectionSecureCrossBorderDataTransfer");
    }
    /**
     * Gets the isGdprImpactAssessment property value. The isGdprImpactAssessment property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprImpactAssessment() {
        return this.backingStore.get("isGdprImpactAssessment");
    }
    /**
     * Gets the isGdprLawfulBasisForProcessing property value. The isGdprLawfulBasisForProcessing property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprLawfulBasisForProcessing() {
        return this.backingStore.get("isGdprLawfulBasisForProcessing");
    }
    /**
     * Gets the isGdprReportDataBreaches property value. The isGdprReportDataBreaches property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprReportDataBreaches() {
        return this.backingStore.get("isGdprReportDataBreaches");
    }
    /**
     * Gets the isGdprRightsRelatedToAutomatedDecisionMaking property value. The isGdprRightsRelatedToAutomatedDecisionMaking property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightsRelatedToAutomatedDecisionMaking() {
        return this.backingStore.get("isGdprRightsRelatedToAutomatedDecisionMaking");
    }
    /**
     * Gets the isGdprRightToAccess property value. The isGdprRightToAccess property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToAccess() {
        return this.backingStore.get("isGdprRightToAccess");
    }
    /**
     * Gets the isGdprRightToBeInformed property value. The isGdprRightToBeInformed property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToBeInformed() {
        return this.backingStore.get("isGdprRightToBeInformed");
    }
    /**
     * Gets the isGdprRightToDataPortablility property value. The isGdprRightToDataPortablility property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToDataPortablility() {
        return this.backingStore.get("isGdprRightToDataPortablility");
    }
    /**
     * Gets the isGdprRightToErasure property value. The isGdprRightToErasure property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToErasure() {
        return this.backingStore.get("isGdprRightToErasure");
    }
    /**
     * Gets the isGdprRightToObject property value. The isGdprRightToObject property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToObject() {
        return this.backingStore.get("isGdprRightToObject");
    }
    /**
     * Gets the isGdprRightToRectification property value. The isGdprRightToRectification property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToRectification() {
        return this.backingStore.get("isGdprRightToRectification");
    }
    /**
     * Gets the isGdprRightToRestrictionOfProcessing property value. The isGdprRightToRestrictionOfProcessing property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprRightToRestrictionOfProcessing() {
        return this.backingStore.get("isGdprRightToRestrictionOfProcessing");
    }
    /**
     * Gets the isGdprSecureCrossBorderDataControl property value. The isGdprSecureCrossBorderDataControl property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGdprSecureCrossBorderDataControl() {
        return this.backingStore.get("isGdprSecureCrossBorderDataControl");
    }
    /**
     * Gets the isGlbaCompliant property value. The isGlbaCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsGlbaCompliant() {
        return this.backingStore.get("isGlbaCompliant");
    }
    /**
     * Gets the isHipaaCompliant property value. The isHipaaCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHipaaCompliant() {
        return this.backingStore.get("isHipaaCompliant");
    }
    /**
     * Gets the isHitrustCsfCompliant property value. The isHitrustCsfCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHitrustCsfCompliant() {
        return this.backingStore.get("isHitrustCsfCompliant");
    }
    /**
     * Gets the isHttpSecurityHeadersContentSecurityPolicy property value. The isHttpSecurityHeadersContentSecurityPolicy property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHttpSecurityHeadersContentSecurityPolicy() {
        return this.backingStore.get("isHttpSecurityHeadersContentSecurityPolicy");
    }
    /**
     * Gets the isHttpSecurityHeadersStrictTransportSecurity property value. The isHttpSecurityHeadersStrictTransportSecurity property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHttpSecurityHeadersStrictTransportSecurity() {
        return this.backingStore.get("isHttpSecurityHeadersStrictTransportSecurity");
    }
    /**
     * Gets the isHttpSecurityHeadersXContentTypeOptions property value. The isHttpSecurityHeadersXContentTypeOptions property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHttpSecurityHeadersXContentTypeOptions() {
        return this.backingStore.get("isHttpSecurityHeadersXContentTypeOptions");
    }
    /**
     * Gets the isHttpSecurityHeadersXFrameOptions property value. The isHttpSecurityHeadersXFrameOptions property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHttpSecurityHeadersXFrameOptions() {
        return this.backingStore.get("isHttpSecurityHeadersXFrameOptions");
    }
    /**
     * Gets the isHttpSecurityHeadersXXssProtection property value. The isHttpSecurityHeadersXXssProtection property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsHttpSecurityHeadersXXssProtection() {
        return this.backingStore.get("isHttpSecurityHeadersXXssProtection");
    }
    /**
     * Gets the isIpAddressRestriction property value. The isIpAddressRestriction property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsIpAddressRestriction() {
        return this.backingStore.get("isIpAddressRestriction");
    }
    /**
     * Gets the isIsae3402Compliant property value. The isIsae3402Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsIsae3402Compliant() {
        return this.backingStore.get("isIsae3402Compliant");
    }
    /**
     * Gets the isIso27001Compliant property value. The isIso27001Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsIso27001Compliant() {
        return this.backingStore.get("isIso27001Compliant");
    }
    /**
     * Gets the isIso27017Compliant property value. The isIso27017Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsIso27017Compliant() {
        return this.backingStore.get("isIso27017Compliant");
    }
    /**
     * Gets the isIso27018Compliant property value. The isIso27018Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsIso27018Compliant() {
        return this.backingStore.get("isIso27018Compliant");
    }
    /**
     * Gets the isItarCompliant property value. The isItarCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsItarCompliant() {
        return this.backingStore.get("isItarCompliant");
    }
    /**
     * Gets the isMultiFactorAuthentication property value. The isMultiFactorAuthentication property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsMultiFactorAuthentication() {
        return this.backingStore.get("isMultiFactorAuthentication");
    }
    /**
     * Gets the isPasswordPolicy property value. The isPasswordPolicy property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicy() {
        return this.backingStore.get("isPasswordPolicy");
    }
    /**
     * Gets the isPasswordPolicyChangePasswordPeriod property value. The isPasswordPolicyChangePasswordPeriod property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicyChangePasswordPeriod() {
        return this.backingStore.get("isPasswordPolicyChangePasswordPeriod");
    }
    /**
     * Gets the isPasswordPolicyCharacterCombination property value. The isPasswordPolicyCharacterCombination property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicyCharacterCombination() {
        return this.backingStore.get("isPasswordPolicyCharacterCombination");
    }
    /**
     * Gets the isPasswordPolicyPasswordHistoryAndReuse property value. The isPasswordPolicyPasswordHistoryAndReuse property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicyPasswordHistoryAndReuse() {
        return this.backingStore.get("isPasswordPolicyPasswordHistoryAndReuse");
    }
    /**
     * Gets the isPasswordPolicyPasswordLengthLimit property value. The isPasswordPolicyPasswordLengthLimit property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicyPasswordLengthLimit() {
        return this.backingStore.get("isPasswordPolicyPasswordLengthLimit");
    }
    /**
     * Gets the isPasswordPolicyPersonalInformationUse property value. The isPasswordPolicyPersonalInformationUse property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPasswordPolicyPersonalInformationUse() {
        return this.backingStore.get("isPasswordPolicyPersonalInformationUse");
    }
    /**
     * Gets the isPenetrationTesting property value. The isPenetrationTesting property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPenetrationTesting() {
        return this.backingStore.get("isPenetrationTesting");
    }
    /**
     * Gets the isPrivacyShieldCompliant property value. The isPrivacyShieldCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsPrivacyShieldCompliant() {
        return this.backingStore.get("isPrivacyShieldCompliant");
    }
    /**
     * Gets the isRememberPassword property value. The isRememberPassword property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsRememberPassword() {
        return this.backingStore.get("isRememberPassword");
    }
    /**
     * Gets the isRequiresUserAuthentication property value. The isRequiresUserAuthentication property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsRequiresUserAuthentication() {
        return this.backingStore.get("isRequiresUserAuthentication");
    }
    /**
     * Gets the isSoc1Compliant property value. The isSoc1Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSoc1Compliant() {
        return this.backingStore.get("isSoc1Compliant");
    }
    /**
     * Gets the isSoc2Compliant property value. The isSoc2Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSoc2Compliant() {
        return this.backingStore.get("isSoc2Compliant");
    }
    /**
     * Gets the isSoc3Compliant property value. The isSoc3Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSoc3Compliant() {
        return this.backingStore.get("isSoc3Compliant");
    }
    /**
     * Gets the isSoxCompliant property value. The isSoxCompliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSoxCompliant() {
        return this.backingStore.get("isSoxCompliant");
    }
    /**
     * Gets the isSp80053Compliant property value. The isSp80053Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSp80053Compliant() {
        return this.backingStore.get("isSp80053Compliant");
    }
    /**
     * Gets the isSsae16Compliant property value. The isSsae16Compliant property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSsae16Compliant() {
        return this.backingStore.get("isSsae16Compliant");
    }
    /**
     * Gets the isSupportsSaml property value. The isSupportsSaml property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsSupportsSaml() {
        return this.backingStore.get("isSupportsSaml");
    }
    /**
     * Gets the isTrustedCertificate property value. The isTrustedCertificate property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsTrustedCertificate() {
        return this.backingStore.get("isTrustedCertificate");
    }
    /**
     * Gets the isUserAuditTrail property value. The isUserAuditTrail property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsUserAuditTrail() {
        return this.backingStore.get("isUserAuditTrail");
    }
    /**
     * Gets the isUserCanUploadData property value. The isUserCanUploadData property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsUserCanUploadData() {
        return this.backingStore.get("isUserCanUploadData");
    }
    /**
     * Gets the isUserRolesSupport property value. The isUserRolesSupport property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsUserRolesSupport() {
        return this.backingStore.get("isUserRolesSupport");
    }
    /**
     * Gets the isValidCertificateName property value. The isValidCertificateName property
     * @return a {@link CloudAppInfoState}
     */
    @jakarta.annotation.Nullable
    public CloudAppInfoState getIsValidCertificateName() {
        return this.backingStore.get("isValidCertificateName");
    }
    /**
     * Gets the latestBreachDateTime property value. Indicates the last date of the data breach for the company.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLatestBreachDateTime() {
        return this.backingStore.get("latestBreachDateTime");
    }
    /**
     * Gets the logonUrls property value. Indicates the URL that users can use to sign into the app.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLogonUrls() {
        return this.backingStore.get("logonUrls");
    }
    /**
     * Gets the pciDssVersion property value. The pciDssVersion property
     * @return a {@link AppInfoPciDssVersion}
     */
    @jakarta.annotation.Nullable
    public AppInfoPciDssVersion getPciDssVersion() {
        return this.backingStore.get("pciDssVersion");
    }
    /**
     * Gets the vendor property value. Indicates the app vendor.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVendor() {
        return this.backingStore.get("vendor");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("csaStarLevel", this.getCsaStarLevel());
        writer.writeEnumValue("dataAtRestEncryptionMethod", this.getDataAtRestEncryptionMethod());
        writer.writeStringValue("dataCenter", this.getDataCenter());
        writer.writeEnumValue("dataRetentionPolicy", this.getDataRetentionPolicy());
        writer.writeCollectionOfEnumValues("dataTypes", this.getDataTypes());
        writer.writeOffsetDateTimeValue("domainRegistrationDateTime", this.getDomainRegistrationDateTime());
        writer.writeEnumValue("encryptionProtocol", this.getEncryptionProtocol());
        writer.writeEnumValue("fedRampLevel", this.getFedRampLevel());
        writer.writeIntegerValue("founded", this.getFounded());
        writer.writeStringValue("gdprReadinessStatement", this.getGdprReadinessStatement());
        writer.writeStringValue("headquarters", this.getHeadquarters());
        writer.writeEnumValue("holding", this.getHolding());
        writer.writeStringValue("hostingCompany", this.getHostingCompany());
        writer.writeEnumValue("isAdminAuditTrail", this.getIsAdminAuditTrail());
        writer.writeEnumValue("isCobitCompliant", this.getIsCobitCompliant());
        writer.writeEnumValue("isCoppaCompliant", this.getIsCoppaCompliant());
        writer.writeEnumValue("isDataAuditTrail", this.getIsDataAuditTrail());
        writer.writeEnumValue("isDataClassification", this.getIsDataClassification());
        writer.writeEnumValue("isDataOwnership", this.getIsDataOwnership());
        writer.writeEnumValue("isDisasterRecoveryPlan", this.getIsDisasterRecoveryPlan());
        writer.writeEnumValue("isDmca", this.getIsDmca());
        writer.writeEnumValue("isFerpaCompliant", this.getIsFerpaCompliant());
        writer.writeEnumValue("isFfiecCompliant", this.getIsFfiecCompliant());
        writer.writeEnumValue("isFileSharing", this.getIsFileSharing());
        writer.writeEnumValue("isFinraCompliant", this.getIsFinraCompliant());
        writer.writeEnumValue("isFismaCompliant", this.getIsFismaCompliant());
        writer.writeEnumValue("isGaapCompliant", this.getIsGaapCompliant());
        writer.writeEnumValue("isGdprDataProtectionImpactAssessment", this.getIsGdprDataProtectionImpactAssessment());
        writer.writeEnumValue("isGdprDataProtectionOfficer", this.getIsGdprDataProtectionOfficer());
        writer.writeEnumValue("isGdprDataProtectionSecureCrossBorderDataTransfer", this.getIsGdprDataProtectionSecureCrossBorderDataTransfer());
        writer.writeEnumValue("isGdprImpactAssessment", this.getIsGdprImpactAssessment());
        writer.writeEnumValue("isGdprLawfulBasisForProcessing", this.getIsGdprLawfulBasisForProcessing());
        writer.writeEnumValue("isGdprReportDataBreaches", this.getIsGdprReportDataBreaches());
        writer.writeEnumValue("isGdprRightsRelatedToAutomatedDecisionMaking", this.getIsGdprRightsRelatedToAutomatedDecisionMaking());
        writer.writeEnumValue("isGdprRightToAccess", this.getIsGdprRightToAccess());
        writer.writeEnumValue("isGdprRightToBeInformed", this.getIsGdprRightToBeInformed());
        writer.writeEnumValue("isGdprRightToDataPortablility", this.getIsGdprRightToDataPortablility());
        writer.writeEnumValue("isGdprRightToErasure", this.getIsGdprRightToErasure());
        writer.writeEnumValue("isGdprRightToObject", this.getIsGdprRightToObject());
        writer.writeEnumValue("isGdprRightToRectification", this.getIsGdprRightToRectification());
        writer.writeEnumValue("isGdprRightToRestrictionOfProcessing", this.getIsGdprRightToRestrictionOfProcessing());
        writer.writeEnumValue("isGdprSecureCrossBorderDataControl", this.getIsGdprSecureCrossBorderDataControl());
        writer.writeEnumValue("isGlbaCompliant", this.getIsGlbaCompliant());
        writer.writeEnumValue("isHipaaCompliant", this.getIsHipaaCompliant());
        writer.writeEnumValue("isHitrustCsfCompliant", this.getIsHitrustCsfCompliant());
        writer.writeEnumValue("isHttpSecurityHeadersContentSecurityPolicy", this.getIsHttpSecurityHeadersContentSecurityPolicy());
        writer.writeEnumValue("isHttpSecurityHeadersStrictTransportSecurity", this.getIsHttpSecurityHeadersStrictTransportSecurity());
        writer.writeEnumValue("isHttpSecurityHeadersXContentTypeOptions", this.getIsHttpSecurityHeadersXContentTypeOptions());
        writer.writeEnumValue("isHttpSecurityHeadersXFrameOptions", this.getIsHttpSecurityHeadersXFrameOptions());
        writer.writeEnumValue("isHttpSecurityHeadersXXssProtection", this.getIsHttpSecurityHeadersXXssProtection());
        writer.writeEnumValue("isIpAddressRestriction", this.getIsIpAddressRestriction());
        writer.writeEnumValue("isIsae3402Compliant", this.getIsIsae3402Compliant());
        writer.writeEnumValue("isIso27001Compliant", this.getIsIso27001Compliant());
        writer.writeEnumValue("isIso27017Compliant", this.getIsIso27017Compliant());
        writer.writeEnumValue("isIso27018Compliant", this.getIsIso27018Compliant());
        writer.writeEnumValue("isItarCompliant", this.getIsItarCompliant());
        writer.writeEnumValue("isMultiFactorAuthentication", this.getIsMultiFactorAuthentication());
        writer.writeEnumValue("isPasswordPolicy", this.getIsPasswordPolicy());
        writer.writeEnumValue("isPasswordPolicyChangePasswordPeriod", this.getIsPasswordPolicyChangePasswordPeriod());
        writer.writeEnumValue("isPasswordPolicyCharacterCombination", this.getIsPasswordPolicyCharacterCombination());
        writer.writeEnumValue("isPasswordPolicyPasswordHistoryAndReuse", this.getIsPasswordPolicyPasswordHistoryAndReuse());
        writer.writeEnumValue("isPasswordPolicyPasswordLengthLimit", this.getIsPasswordPolicyPasswordLengthLimit());
        writer.writeEnumValue("isPasswordPolicyPersonalInformationUse", this.getIsPasswordPolicyPersonalInformationUse());
        writer.writeEnumValue("isPenetrationTesting", this.getIsPenetrationTesting());
        writer.writeEnumValue("isPrivacyShieldCompliant", this.getIsPrivacyShieldCompliant());
        writer.writeEnumValue("isRememberPassword", this.getIsRememberPassword());
        writer.writeEnumValue("isRequiresUserAuthentication", this.getIsRequiresUserAuthentication());
        writer.writeEnumValue("isSoc1Compliant", this.getIsSoc1Compliant());
        writer.writeEnumValue("isSoc2Compliant", this.getIsSoc2Compliant());
        writer.writeEnumValue("isSoc3Compliant", this.getIsSoc3Compliant());
        writer.writeEnumValue("isSoxCompliant", this.getIsSoxCompliant());
        writer.writeEnumValue("isSp80053Compliant", this.getIsSp80053Compliant());
        writer.writeEnumValue("isSsae16Compliant", this.getIsSsae16Compliant());
        writer.writeEnumValue("isSupportsSaml", this.getIsSupportsSaml());
        writer.writeEnumValue("isTrustedCertificate", this.getIsTrustedCertificate());
        writer.writeEnumValue("isUserAuditTrail", this.getIsUserAuditTrail());
        writer.writeEnumValue("isUserCanUploadData", this.getIsUserCanUploadData());
        writer.writeEnumValue("isUserRolesSupport", this.getIsUserRolesSupport());
        writer.writeEnumValue("isValidCertificateName", this.getIsValidCertificateName());
        writer.writeOffsetDateTimeValue("latestBreachDateTime", this.getLatestBreachDateTime());
        writer.writeCollectionOfPrimitiveValues("logonUrls", this.getLogonUrls());
        writer.writeEnumValue("pciDssVersion", this.getPciDssVersion());
        writer.writeStringValue("vendor", this.getVendor());
    }
    /**
     * Sets the csaStarLevel property value. The csaStarLevel property
     * @param value Value to set for the csaStarLevel property.
     */
    public void setCsaStarLevel(@jakarta.annotation.Nullable final AppInfoCsaStarLevel value) {
        this.backingStore.set("csaStarLevel", value);
    }
    /**
     * Sets the dataAtRestEncryptionMethod property value. The dataAtRestEncryptionMethod property
     * @param value Value to set for the dataAtRestEncryptionMethod property.
     */
    public void setDataAtRestEncryptionMethod(@jakarta.annotation.Nullable final AppInfoDataAtRestEncryptionMethod value) {
        this.backingStore.set("dataAtRestEncryptionMethod", value);
    }
    /**
     * Sets the dataCenter property value. Indicates the countries or regions in which your data center resides.
     * @param value Value to set for the dataCenter property.
     */
    public void setDataCenter(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dataCenter", value);
    }
    /**
     * Sets the dataRetentionPolicy property value. The dataRetentionPolicy property
     * @param value Value to set for the dataRetentionPolicy property.
     */
    public void setDataRetentionPolicy(@jakarta.annotation.Nullable final AppInfoDataRetentionPolicy value) {
        this.backingStore.set("dataRetentionPolicy", value);
    }
    /**
     * Sets the dataTypes property value. Indicates the data types that an end user can upload to the app. The possible values are: documents, mediaFiles, codingFiles, creditCards, databaseFiles, none, unknown, unknownFutureValue.
     * @param value Value to set for the dataTypes property.
     */
    public void setDataTypes(@jakarta.annotation.Nullable final java.util.List<AppInfoUploadedDataTypes> value) {
        this.backingStore.set("dataTypes", value);
    }
    /**
     * Sets the domainRegistrationDateTime property value. Indicates the date when the app domain was registered.
     * @param value Value to set for the domainRegistrationDateTime property.
     */
    public void setDomainRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("domainRegistrationDateTime", value);
    }
    /**
     * Sets the encryptionProtocol property value. The encryptionProtocol property
     * @param value Value to set for the encryptionProtocol property.
     */
    public void setEncryptionProtocol(@jakarta.annotation.Nullable final AppInfoEncryptionProtocol value) {
        this.backingStore.set("encryptionProtocol", value);
    }
    /**
     * Sets the fedRampLevel property value. The fedRampLevel property
     * @param value Value to set for the fedRampLevel property.
     */
    public void setFedRampLevel(@jakarta.annotation.Nullable final AppInfoFedRampLevel value) {
        this.backingStore.set("fedRampLevel", value);
    }
    /**
     * Sets the founded property value. Indicates the year that the specific app vendor was established.
     * @param value Value to set for the founded property.
     */
    public void setFounded(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("founded", value);
    }
    /**
     * Sets the gdprReadinessStatement property value. Indicates the GDPR readiness of the app in relation to policies app provides to safeguard personal user data.
     * @param value Value to set for the gdprReadinessStatement property.
     */
    public void setGdprReadinessStatement(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("gdprReadinessStatement", value);
    }
    /**
     * Sets the headquarters property value. Indicates the location of the headquarters of the app.
     * @param value Value to set for the headquarters property.
     */
    public void setHeadquarters(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("headquarters", value);
    }
    /**
     * Sets the holding property value. The holding property
     * @param value Value to set for the holding property.
     */
    public void setHolding(@jakarta.annotation.Nullable final AppInfoHolding value) {
        this.backingStore.set("holding", value);
    }
    /**
     * Sets the hostingCompany property value. Indicates the company name that provides hosting services for the app.
     * @param value Value to set for the hostingCompany property.
     */
    public void setHostingCompany(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostingCompany", value);
    }
    /**
     * Sets the isAdminAuditTrail property value. The isAdminAuditTrail property
     * @param value Value to set for the isAdminAuditTrail property.
     */
    public void setIsAdminAuditTrail(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isAdminAuditTrail", value);
    }
    /**
     * Sets the isCobitCompliant property value. The isCobitCompliant property
     * @param value Value to set for the isCobitCompliant property.
     */
    public void setIsCobitCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isCobitCompliant", value);
    }
    /**
     * Sets the isCoppaCompliant property value. The isCoppaCompliant property
     * @param value Value to set for the isCoppaCompliant property.
     */
    public void setIsCoppaCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isCoppaCompliant", value);
    }
    /**
     * Sets the isDataAuditTrail property value. The isDataAuditTrail property
     * @param value Value to set for the isDataAuditTrail property.
     */
    public void setIsDataAuditTrail(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isDataAuditTrail", value);
    }
    /**
     * Sets the isDataClassification property value. The isDataClassification property
     * @param value Value to set for the isDataClassification property.
     */
    public void setIsDataClassification(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isDataClassification", value);
    }
    /**
     * Sets the isDataOwnership property value. The isDataOwnership property
     * @param value Value to set for the isDataOwnership property.
     */
    public void setIsDataOwnership(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isDataOwnership", value);
    }
    /**
     * Sets the isDisasterRecoveryPlan property value. The isDisasterRecoveryPlan property
     * @param value Value to set for the isDisasterRecoveryPlan property.
     */
    public void setIsDisasterRecoveryPlan(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isDisasterRecoveryPlan", value);
    }
    /**
     * Sets the isDmca property value. The isDmca property
     * @param value Value to set for the isDmca property.
     */
    public void setIsDmca(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isDmca", value);
    }
    /**
     * Sets the isFerpaCompliant property value. The isFerpaCompliant property
     * @param value Value to set for the isFerpaCompliant property.
     */
    public void setIsFerpaCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isFerpaCompliant", value);
    }
    /**
     * Sets the isFfiecCompliant property value. The isFfiecCompliant property
     * @param value Value to set for the isFfiecCompliant property.
     */
    public void setIsFfiecCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isFfiecCompliant", value);
    }
    /**
     * Sets the isFileSharing property value. The isFileSharing property
     * @param value Value to set for the isFileSharing property.
     */
    public void setIsFileSharing(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isFileSharing", value);
    }
    /**
     * Sets the isFinraCompliant property value. The isFinraCompliant property
     * @param value Value to set for the isFinraCompliant property.
     */
    public void setIsFinraCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isFinraCompliant", value);
    }
    /**
     * Sets the isFismaCompliant property value. The isFismaCompliant property
     * @param value Value to set for the isFismaCompliant property.
     */
    public void setIsFismaCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isFismaCompliant", value);
    }
    /**
     * Sets the isGaapCompliant property value. The isGaapCompliant property
     * @param value Value to set for the isGaapCompliant property.
     */
    public void setIsGaapCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGaapCompliant", value);
    }
    /**
     * Sets the isGdprDataProtectionImpactAssessment property value. The isGdprDataProtectionImpactAssessment property
     * @param value Value to set for the isGdprDataProtectionImpactAssessment property.
     */
    public void setIsGdprDataProtectionImpactAssessment(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprDataProtectionImpactAssessment", value);
    }
    /**
     * Sets the isGdprDataProtectionOfficer property value. The isGdprDataProtectionOfficer property
     * @param value Value to set for the isGdprDataProtectionOfficer property.
     */
    public void setIsGdprDataProtectionOfficer(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprDataProtectionOfficer", value);
    }
    /**
     * Sets the isGdprDataProtectionSecureCrossBorderDataTransfer property value. The isGdprDataProtectionSecureCrossBorderDataTransfer property
     * @param value Value to set for the isGdprDataProtectionSecureCrossBorderDataTransfer property.
     */
    public void setIsGdprDataProtectionSecureCrossBorderDataTransfer(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprDataProtectionSecureCrossBorderDataTransfer", value);
    }
    /**
     * Sets the isGdprImpactAssessment property value. The isGdprImpactAssessment property
     * @param value Value to set for the isGdprImpactAssessment property.
     */
    public void setIsGdprImpactAssessment(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprImpactAssessment", value);
    }
    /**
     * Sets the isGdprLawfulBasisForProcessing property value. The isGdprLawfulBasisForProcessing property
     * @param value Value to set for the isGdprLawfulBasisForProcessing property.
     */
    public void setIsGdprLawfulBasisForProcessing(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprLawfulBasisForProcessing", value);
    }
    /**
     * Sets the isGdprReportDataBreaches property value. The isGdprReportDataBreaches property
     * @param value Value to set for the isGdprReportDataBreaches property.
     */
    public void setIsGdprReportDataBreaches(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprReportDataBreaches", value);
    }
    /**
     * Sets the isGdprRightsRelatedToAutomatedDecisionMaking property value. The isGdprRightsRelatedToAutomatedDecisionMaking property
     * @param value Value to set for the isGdprRightsRelatedToAutomatedDecisionMaking property.
     */
    public void setIsGdprRightsRelatedToAutomatedDecisionMaking(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightsRelatedToAutomatedDecisionMaking", value);
    }
    /**
     * Sets the isGdprRightToAccess property value. The isGdprRightToAccess property
     * @param value Value to set for the isGdprRightToAccess property.
     */
    public void setIsGdprRightToAccess(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToAccess", value);
    }
    /**
     * Sets the isGdprRightToBeInformed property value. The isGdprRightToBeInformed property
     * @param value Value to set for the isGdprRightToBeInformed property.
     */
    public void setIsGdprRightToBeInformed(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToBeInformed", value);
    }
    /**
     * Sets the isGdprRightToDataPortablility property value. The isGdprRightToDataPortablility property
     * @param value Value to set for the isGdprRightToDataPortablility property.
     */
    public void setIsGdprRightToDataPortablility(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToDataPortablility", value);
    }
    /**
     * Sets the isGdprRightToErasure property value. The isGdprRightToErasure property
     * @param value Value to set for the isGdprRightToErasure property.
     */
    public void setIsGdprRightToErasure(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToErasure", value);
    }
    /**
     * Sets the isGdprRightToObject property value. The isGdprRightToObject property
     * @param value Value to set for the isGdprRightToObject property.
     */
    public void setIsGdprRightToObject(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToObject", value);
    }
    /**
     * Sets the isGdprRightToRectification property value. The isGdprRightToRectification property
     * @param value Value to set for the isGdprRightToRectification property.
     */
    public void setIsGdprRightToRectification(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToRectification", value);
    }
    /**
     * Sets the isGdprRightToRestrictionOfProcessing property value. The isGdprRightToRestrictionOfProcessing property
     * @param value Value to set for the isGdprRightToRestrictionOfProcessing property.
     */
    public void setIsGdprRightToRestrictionOfProcessing(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprRightToRestrictionOfProcessing", value);
    }
    /**
     * Sets the isGdprSecureCrossBorderDataControl property value. The isGdprSecureCrossBorderDataControl property
     * @param value Value to set for the isGdprSecureCrossBorderDataControl property.
     */
    public void setIsGdprSecureCrossBorderDataControl(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGdprSecureCrossBorderDataControl", value);
    }
    /**
     * Sets the isGlbaCompliant property value. The isGlbaCompliant property
     * @param value Value to set for the isGlbaCompliant property.
     */
    public void setIsGlbaCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isGlbaCompliant", value);
    }
    /**
     * Sets the isHipaaCompliant property value. The isHipaaCompliant property
     * @param value Value to set for the isHipaaCompliant property.
     */
    public void setIsHipaaCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHipaaCompliant", value);
    }
    /**
     * Sets the isHitrustCsfCompliant property value. The isHitrustCsfCompliant property
     * @param value Value to set for the isHitrustCsfCompliant property.
     */
    public void setIsHitrustCsfCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHitrustCsfCompliant", value);
    }
    /**
     * Sets the isHttpSecurityHeadersContentSecurityPolicy property value. The isHttpSecurityHeadersContentSecurityPolicy property
     * @param value Value to set for the isHttpSecurityHeadersContentSecurityPolicy property.
     */
    public void setIsHttpSecurityHeadersContentSecurityPolicy(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHttpSecurityHeadersContentSecurityPolicy", value);
    }
    /**
     * Sets the isHttpSecurityHeadersStrictTransportSecurity property value. The isHttpSecurityHeadersStrictTransportSecurity property
     * @param value Value to set for the isHttpSecurityHeadersStrictTransportSecurity property.
     */
    public void setIsHttpSecurityHeadersStrictTransportSecurity(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHttpSecurityHeadersStrictTransportSecurity", value);
    }
    /**
     * Sets the isHttpSecurityHeadersXContentTypeOptions property value. The isHttpSecurityHeadersXContentTypeOptions property
     * @param value Value to set for the isHttpSecurityHeadersXContentTypeOptions property.
     */
    public void setIsHttpSecurityHeadersXContentTypeOptions(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHttpSecurityHeadersXContentTypeOptions", value);
    }
    /**
     * Sets the isHttpSecurityHeadersXFrameOptions property value. The isHttpSecurityHeadersXFrameOptions property
     * @param value Value to set for the isHttpSecurityHeadersXFrameOptions property.
     */
    public void setIsHttpSecurityHeadersXFrameOptions(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHttpSecurityHeadersXFrameOptions", value);
    }
    /**
     * Sets the isHttpSecurityHeadersXXssProtection property value. The isHttpSecurityHeadersXXssProtection property
     * @param value Value to set for the isHttpSecurityHeadersXXssProtection property.
     */
    public void setIsHttpSecurityHeadersXXssProtection(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isHttpSecurityHeadersXXssProtection", value);
    }
    /**
     * Sets the isIpAddressRestriction property value. The isIpAddressRestriction property
     * @param value Value to set for the isIpAddressRestriction property.
     */
    public void setIsIpAddressRestriction(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isIpAddressRestriction", value);
    }
    /**
     * Sets the isIsae3402Compliant property value. The isIsae3402Compliant property
     * @param value Value to set for the isIsae3402Compliant property.
     */
    public void setIsIsae3402Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isIsae3402Compliant", value);
    }
    /**
     * Sets the isIso27001Compliant property value. The isIso27001Compliant property
     * @param value Value to set for the isIso27001Compliant property.
     */
    public void setIsIso27001Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isIso27001Compliant", value);
    }
    /**
     * Sets the isIso27017Compliant property value. The isIso27017Compliant property
     * @param value Value to set for the isIso27017Compliant property.
     */
    public void setIsIso27017Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isIso27017Compliant", value);
    }
    /**
     * Sets the isIso27018Compliant property value. The isIso27018Compliant property
     * @param value Value to set for the isIso27018Compliant property.
     */
    public void setIsIso27018Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isIso27018Compliant", value);
    }
    /**
     * Sets the isItarCompliant property value. The isItarCompliant property
     * @param value Value to set for the isItarCompliant property.
     */
    public void setIsItarCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isItarCompliant", value);
    }
    /**
     * Sets the isMultiFactorAuthentication property value. The isMultiFactorAuthentication property
     * @param value Value to set for the isMultiFactorAuthentication property.
     */
    public void setIsMultiFactorAuthentication(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isMultiFactorAuthentication", value);
    }
    /**
     * Sets the isPasswordPolicy property value. The isPasswordPolicy property
     * @param value Value to set for the isPasswordPolicy property.
     */
    public void setIsPasswordPolicy(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicy", value);
    }
    /**
     * Sets the isPasswordPolicyChangePasswordPeriod property value. The isPasswordPolicyChangePasswordPeriod property
     * @param value Value to set for the isPasswordPolicyChangePasswordPeriod property.
     */
    public void setIsPasswordPolicyChangePasswordPeriod(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicyChangePasswordPeriod", value);
    }
    /**
     * Sets the isPasswordPolicyCharacterCombination property value. The isPasswordPolicyCharacterCombination property
     * @param value Value to set for the isPasswordPolicyCharacterCombination property.
     */
    public void setIsPasswordPolicyCharacterCombination(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicyCharacterCombination", value);
    }
    /**
     * Sets the isPasswordPolicyPasswordHistoryAndReuse property value. The isPasswordPolicyPasswordHistoryAndReuse property
     * @param value Value to set for the isPasswordPolicyPasswordHistoryAndReuse property.
     */
    public void setIsPasswordPolicyPasswordHistoryAndReuse(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicyPasswordHistoryAndReuse", value);
    }
    /**
     * Sets the isPasswordPolicyPasswordLengthLimit property value. The isPasswordPolicyPasswordLengthLimit property
     * @param value Value to set for the isPasswordPolicyPasswordLengthLimit property.
     */
    public void setIsPasswordPolicyPasswordLengthLimit(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicyPasswordLengthLimit", value);
    }
    /**
     * Sets the isPasswordPolicyPersonalInformationUse property value. The isPasswordPolicyPersonalInformationUse property
     * @param value Value to set for the isPasswordPolicyPersonalInformationUse property.
     */
    public void setIsPasswordPolicyPersonalInformationUse(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPasswordPolicyPersonalInformationUse", value);
    }
    /**
     * Sets the isPenetrationTesting property value. The isPenetrationTesting property
     * @param value Value to set for the isPenetrationTesting property.
     */
    public void setIsPenetrationTesting(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPenetrationTesting", value);
    }
    /**
     * Sets the isPrivacyShieldCompliant property value. The isPrivacyShieldCompliant property
     * @param value Value to set for the isPrivacyShieldCompliant property.
     */
    public void setIsPrivacyShieldCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isPrivacyShieldCompliant", value);
    }
    /**
     * Sets the isRememberPassword property value. The isRememberPassword property
     * @param value Value to set for the isRememberPassword property.
     */
    public void setIsRememberPassword(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isRememberPassword", value);
    }
    /**
     * Sets the isRequiresUserAuthentication property value. The isRequiresUserAuthentication property
     * @param value Value to set for the isRequiresUserAuthentication property.
     */
    public void setIsRequiresUserAuthentication(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isRequiresUserAuthentication", value);
    }
    /**
     * Sets the isSoc1Compliant property value. The isSoc1Compliant property
     * @param value Value to set for the isSoc1Compliant property.
     */
    public void setIsSoc1Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSoc1Compliant", value);
    }
    /**
     * Sets the isSoc2Compliant property value. The isSoc2Compliant property
     * @param value Value to set for the isSoc2Compliant property.
     */
    public void setIsSoc2Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSoc2Compliant", value);
    }
    /**
     * Sets the isSoc3Compliant property value. The isSoc3Compliant property
     * @param value Value to set for the isSoc3Compliant property.
     */
    public void setIsSoc3Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSoc3Compliant", value);
    }
    /**
     * Sets the isSoxCompliant property value. The isSoxCompliant property
     * @param value Value to set for the isSoxCompliant property.
     */
    public void setIsSoxCompliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSoxCompliant", value);
    }
    /**
     * Sets the isSp80053Compliant property value. The isSp80053Compliant property
     * @param value Value to set for the isSp80053Compliant property.
     */
    public void setIsSp80053Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSp80053Compliant", value);
    }
    /**
     * Sets the isSsae16Compliant property value. The isSsae16Compliant property
     * @param value Value to set for the isSsae16Compliant property.
     */
    public void setIsSsae16Compliant(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSsae16Compliant", value);
    }
    /**
     * Sets the isSupportsSaml property value. The isSupportsSaml property
     * @param value Value to set for the isSupportsSaml property.
     */
    public void setIsSupportsSaml(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isSupportsSaml", value);
    }
    /**
     * Sets the isTrustedCertificate property value. The isTrustedCertificate property
     * @param value Value to set for the isTrustedCertificate property.
     */
    public void setIsTrustedCertificate(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isTrustedCertificate", value);
    }
    /**
     * Sets the isUserAuditTrail property value. The isUserAuditTrail property
     * @param value Value to set for the isUserAuditTrail property.
     */
    public void setIsUserAuditTrail(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isUserAuditTrail", value);
    }
    /**
     * Sets the isUserCanUploadData property value. The isUserCanUploadData property
     * @param value Value to set for the isUserCanUploadData property.
     */
    public void setIsUserCanUploadData(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isUserCanUploadData", value);
    }
    /**
     * Sets the isUserRolesSupport property value. The isUserRolesSupport property
     * @param value Value to set for the isUserRolesSupport property.
     */
    public void setIsUserRolesSupport(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isUserRolesSupport", value);
    }
    /**
     * Sets the isValidCertificateName property value. The isValidCertificateName property
     * @param value Value to set for the isValidCertificateName property.
     */
    public void setIsValidCertificateName(@jakarta.annotation.Nullable final CloudAppInfoState value) {
        this.backingStore.set("isValidCertificateName", value);
    }
    /**
     * Sets the latestBreachDateTime property value. Indicates the last date of the data breach for the company.
     * @param value Value to set for the latestBreachDateTime property.
     */
    public void setLatestBreachDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("latestBreachDateTime", value);
    }
    /**
     * Sets the logonUrls property value. Indicates the URL that users can use to sign into the app.
     * @param value Value to set for the logonUrls property.
     */
    public void setLogonUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("logonUrls", value);
    }
    /**
     * Sets the pciDssVersion property value. The pciDssVersion property
     * @param value Value to set for the pciDssVersion property.
     */
    public void setPciDssVersion(@jakarta.annotation.Nullable final AppInfoPciDssVersion value) {
        this.backingStore.set("pciDssVersion", value);
    }
    /**
     * Sets the vendor property value. Indicates the app vendor.
     * @param value Value to set for the vendor property.
     */
    public void setVendor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vendor", value);
    }
}
