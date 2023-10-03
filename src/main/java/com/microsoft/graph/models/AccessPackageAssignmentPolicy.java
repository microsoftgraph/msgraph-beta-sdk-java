package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageAssignmentPolicy extends Entity implements Parsable {
    /**
     * The access package with this policy. Read-only. Nullable. Supports $expand.
     */
    private AccessPackage accessPackage;
    /**
     * The accessPackageCatalog property
     */
    private AccessPackageCatalog accessPackageCatalog;
    /**
     * Identifier of the access package.
     */
    private String accessPackageId;
    /**
     * Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     */
    private AssignmentReviewSettings accessReviewSettings;
    /**
     * Indicates whether a user can extend the access package assignment duration after approval.
     */
    private Boolean canExtend;
    /**
     * The createdBy property
     */
    private String createdBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime createdDateTime;
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     */
    private java.util.List<CustomExtensionHandler> customExtensionHandlers;
    /**
     * The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     */
    private java.util.List<CustomExtensionStageSetting> customExtensionStageSettings;
    /**
     * The description of the policy.
     */
    private String description;
    /**
     * The display name of the policy. Supports $filter (eq).
     */
    private String displayName;
    /**
     * The number of days in which assignments from this policy last until they are expired.
     */
    private Integer durationInDays;
    /**
     * The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The modifiedBy property
     */
    private String modifiedBy;
    /**
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    private OffsetDateTime modifiedDateTime;
    /**
     * Questions that are posed to the  requestor.
     */
    private java.util.List<AccessPackageQuestion> questions;
    /**
     * Who must approve requests for access package in this policy.
     */
    private ApprovalSettings requestApprovalSettings;
    /**
     * Who can request this access package from this policy.
     */
    private RequestorSettings requestorSettings;
    /**
     * Settings for verifiable credentials set up through the Azure AD Verified ID service. These settings represent the verifiable credentials that a requestor of an access package in this policy can present to be assigned the access package.
     */
    private VerifiableCredentialSettings verifiableCredentialSettings;
    /**
     * Instantiates a new AccessPackageAssignmentPolicy and sets the default values.
     */
    public AccessPackageAssignmentPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageAssignmentPolicy
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageAssignmentPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageAssignmentPolicy();
    }
    /**
     * Gets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @return a AccessPackage
     */
    @jakarta.annotation.Nullable
    public AccessPackage getAccessPackage() {
        return this.accessPackage;
    }
    /**
     * Gets the accessPackageCatalog property value. The accessPackageCatalog property
     * @return a AccessPackageCatalog
     */
    @jakarta.annotation.Nullable
    public AccessPackageCatalog getAccessPackageCatalog() {
        return this.accessPackageCatalog;
    }
    /**
     * Gets the accessPackageId property value. Identifier of the access package.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessPackageId() {
        return this.accessPackageId;
    }
    /**
     * Gets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     * @return a AssignmentReviewSettings
     */
    @jakarta.annotation.Nullable
    public AssignmentReviewSettings getAccessReviewSettings() {
        return this.accessReviewSettings;
    }
    /**
     * Gets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCanExtend() {
        return this.canExtend;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a java.util.List<CustomExtensionHandler>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionHandler> getCustomExtensionHandlers() {
        return this.customExtensionHandlers;
    }
    /**
     * Gets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @return a java.util.List<CustomExtensionStageSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomExtensionStageSetting> getCustomExtensionStageSettings() {
        return this.customExtensionStageSettings;
    }
    /**
     * Gets the description property value. The description of the policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the durationInDays property value. The number of days in which assignments from this policy last until they are expired.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.durationInDays;
    }
    /**
     * Gets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessPackage", (n) -> { this.setAccessPackage(n.getObjectValue(AccessPackage::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageCatalog", (n) -> { this.setAccessPackageCatalog(n.getObjectValue(AccessPackageCatalog::createFromDiscriminatorValue)); });
        deserializerMap.put("accessPackageId", (n) -> { this.setAccessPackageId(n.getStringValue()); });
        deserializerMap.put("accessReviewSettings", (n) -> { this.setAccessReviewSettings(n.getObjectValue(AssignmentReviewSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("canExtend", (n) -> { this.setCanExtend(n.getBooleanValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionHandlers", (n) -> { this.setCustomExtensionHandlers(n.getCollectionOfObjectValues(CustomExtensionHandler::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtensionStageSettings", (n) -> { this.setCustomExtensionStageSettings(n.getCollectionOfObjectValues(CustomExtensionStageSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("questions", (n) -> { this.setQuestions(n.getCollectionOfObjectValues(AccessPackageQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("requestApprovalSettings", (n) -> { this.setRequestApprovalSettings(n.getObjectValue(ApprovalSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("requestorSettings", (n) -> { this.setRequestorSettings(n.getObjectValue(RequestorSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiableCredentialSettings", (n) -> { this.setVerifiableCredentialSettings(n.getObjectValue(VerifiableCredentialSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedBy property value. The modifiedBy property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.modifiedBy;
    }
    /**
     * Gets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.modifiedDateTime;
    }
    /**
     * Gets the questions property value. Questions that are posed to the  requestor.
     * @return a java.util.List<AccessPackageQuestion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessPackageQuestion> getQuestions() {
        return this.questions;
    }
    /**
     * Gets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @return a ApprovalSettings
     */
    @jakarta.annotation.Nullable
    public ApprovalSettings getRequestApprovalSettings() {
        return this.requestApprovalSettings;
    }
    /**
     * Gets the requestorSettings property value. Who can request this access package from this policy.
     * @return a RequestorSettings
     */
    @jakarta.annotation.Nullable
    public RequestorSettings getRequestorSettings() {
        return this.requestorSettings;
    }
    /**
     * Gets the verifiableCredentialSettings property value. Settings for verifiable credentials set up through the Azure AD Verified ID service. These settings represent the verifiable credentials that a requestor of an access package in this policy can present to be assigned the access package.
     * @return a VerifiableCredentialSettings
     */
    @jakarta.annotation.Nullable
    public VerifiableCredentialSettings getVerifiableCredentialSettings() {
        return this.verifiableCredentialSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("accessPackage", this.getAccessPackage());
        writer.writeObjectValue("accessPackageCatalog", this.getAccessPackageCatalog());
        writer.writeStringValue("accessPackageId", this.getAccessPackageId());
        writer.writeObjectValue("accessReviewSettings", this.getAccessReviewSettings());
        writer.writeBooleanValue("canExtend", this.getCanExtend());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("customExtensionHandlers", this.getCustomExtensionHandlers());
        writer.writeCollectionOfObjectValues("customExtensionStageSettings", this.getCustomExtensionStageSettings());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeCollectionOfObjectValues("questions", this.getQuestions());
        writer.writeObjectValue("requestApprovalSettings", this.getRequestApprovalSettings());
        writer.writeObjectValue("requestorSettings", this.getRequestorSettings());
        writer.writeObjectValue("verifiableCredentialSettings", this.getVerifiableCredentialSettings());
    }
    /**
     * Sets the accessPackage property value. The access package with this policy. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the accessPackage property.
     */
    public void setAccessPackage(@jakarta.annotation.Nullable final AccessPackage value) {
        this.accessPackage = value;
    }
    /**
     * Sets the accessPackageCatalog property value. The accessPackageCatalog property
     * @param value Value to set for the accessPackageCatalog property.
     */
    public void setAccessPackageCatalog(@jakarta.annotation.Nullable final AccessPackageCatalog value) {
        this.accessPackageCatalog = value;
    }
    /**
     * Sets the accessPackageId property value. Identifier of the access package.
     * @param value Value to set for the accessPackageId property.
     */
    public void setAccessPackageId(@jakarta.annotation.Nullable final String value) {
        this.accessPackageId = value;
    }
    /**
     * Sets the accessReviewSettings property value. Who must review, and how often, the assignments to the access package from this policy. This property is null if reviews are not required.
     * @param value Value to set for the accessReviewSettings property.
     */
    public void setAccessReviewSettings(@jakarta.annotation.Nullable final AssignmentReviewSettings value) {
        this.accessReviewSettings = value;
    }
    /**
     * Sets the canExtend property value. Indicates whether a user can extend the access package assignment duration after approval.
     * @param value Value to set for the canExtend property.
     */
    public void setCanExtend(@jakarta.annotation.Nullable final Boolean value) {
        this.canExtend = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the customExtensionHandlers property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionHandlers property.
     */
    public void setCustomExtensionHandlers(@jakarta.annotation.Nullable final java.util.List<CustomExtensionHandler> value) {
        this.customExtensionHandlers = value;
    }
    /**
     * Sets the customExtensionStageSettings property value. The collection of stages when to execute one or more custom access package workflow extensions. Supports $expand.
     * @param value Value to set for the customExtensionStageSettings property.
     */
    public void setCustomExtensionStageSettings(@jakarta.annotation.Nullable final java.util.List<CustomExtensionStageSetting> value) {
        this.customExtensionStageSettings = value;
    }
    /**
     * Sets the description property value. The description of the policy.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name of the policy. Supports $filter (eq).
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the durationInDays property value. The number of days in which assignments from this policy last until they are expired.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.durationInDays = value;
    }
    /**
     * Sets the expirationDateTime property value. The expiration date for assignments created in this policy. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the modifiedBy property value. The modifiedBy property
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.modifiedBy = value;
    }
    /**
     * Sets the modifiedDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedDateTime = value;
    }
    /**
     * Sets the questions property value. Questions that are posed to the  requestor.
     * @param value Value to set for the questions property.
     */
    public void setQuestions(@jakarta.annotation.Nullable final java.util.List<AccessPackageQuestion> value) {
        this.questions = value;
    }
    /**
     * Sets the requestApprovalSettings property value. Who must approve requests for access package in this policy.
     * @param value Value to set for the requestApprovalSettings property.
     */
    public void setRequestApprovalSettings(@jakarta.annotation.Nullable final ApprovalSettings value) {
        this.requestApprovalSettings = value;
    }
    /**
     * Sets the requestorSettings property value. Who can request this access package from this policy.
     * @param value Value to set for the requestorSettings property.
     */
    public void setRequestorSettings(@jakarta.annotation.Nullable final RequestorSettings value) {
        this.requestorSettings = value;
    }
    /**
     * Sets the verifiableCredentialSettings property value. Settings for verifiable credentials set up through the Azure AD Verified ID service. These settings represent the verifiable credentials that a requestor of an access package in this policy can present to be assigned the access package.
     * @param value Value to set for the verifiableCredentialSettings property.
     */
    public void setVerifiableCredentialSettings(@jakarta.annotation.Nullable final VerifiableCredentialSettings value) {
        this.verifiableCredentialSettings = value;
    }
}
