package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * These are elevation approval requests for EPM support arbitrated scenario initiated by IW user that admins can take action on.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegeManagementElevationRequest extends Entity implements Parsable {
    /**
     * Instantiates a new PrivilegeManagementElevationRequest and sets the default values.
     */
    public PrivilegeManagementElevationRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegeManagementElevationRequest
     */
    @jakarta.annotation.Nonnull
    public static PrivilegeManagementElevationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegeManagementElevationRequest();
    }
    /**
     * Gets the applicationDetail property value. Details of the application which is being requested to elevate, allowing the admin to understand the identity of the application. It includes file info such as FilePath, FileHash, FilePublisher, and etc. Returned by default. Read-only.
     * @return a ApplicationDetail
     */
    @jakarta.annotation.Nullable
    public ApplicationDetail getApplicationDetail() {
        return this.backingStore.get("applicationDetail");
    }
    /**
     * Gets the deviceName property value. The device name used to initiate the elevation request. For example: 'cotonso-laptop'. Returned by default. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationDetail", (n) -> { this.setApplicationDetail(n.getObjectValue(ApplicationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("requestCreatedDateTime", (n) -> { this.setRequestCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedByUserId", (n) -> { this.setRequestedByUserId(n.getStringValue()); });
        deserializerMap.put("requestedByUserPrincipalName", (n) -> { this.setRequestedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("requestedOnDeviceId", (n) -> { this.setRequestedOnDeviceId(n.getStringValue()); });
        deserializerMap.put("requestExpiryDateTime", (n) -> { this.setRequestExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestJustification", (n) -> { this.setRequestJustification(n.getStringValue()); });
        deserializerMap.put("requestLastModifiedDateTime", (n) -> { this.setRequestLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewCompletedByUserId", (n) -> { this.setReviewCompletedByUserId(n.getStringValue()); });
        deserializerMap.put("reviewCompletedByUserPrincipalName", (n) -> { this.setReviewCompletedByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("reviewCompletedDateTime", (n) -> { this.setReviewCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reviewerJustification", (n) -> { this.setReviewerJustification(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ElevationRequestState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the requestCreatedDateTime property value. The date and time when the elevation request was submitted/created. The value cannot be modified and is automatically populated when the elevation request is submitted/created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestCreatedDateTime() {
        return this.backingStore.get("requestCreatedDateTime");
    }
    /**
     * Gets the requestedByUserId property value. The Azure Active Directory (AAD) identifier of the end user who is requesting this elevation. For example: 'F1A57311-B9EB-45B7-9415-8555E68EDC9E'. Returned by default. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestedByUserId() {
        return this.backingStore.get("requestedByUserId");
    }
    /**
     * Gets the requestedByUserPrincipalName property value. The User Principal Name (UPN) of the end user who requested this elevation. For example: 'user1@contoso.com'. Returned by default. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestedByUserPrincipalName() {
        return this.backingStore.get("requestedByUserPrincipalName");
    }
    /**
     * Gets the requestedOnDeviceId property value. The Intune Device Identifier of the managed device used to initiate the elevation request. For example: '90F5F6E8-CA09-4811-97F6-4D0DD532D916'. Returned by default. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestedOnDeviceId() {
        return this.backingStore.get("requestedOnDeviceId");
    }
    /**
     * Gets the requestExpiryDateTime property value. Expiration set for the request when it was created, regardless of approved or denied status. For example: '2023-08-03T14:24:22Z'. Returned by default. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestExpiryDateTime() {
        return this.backingStore.get("requestExpiryDateTime");
    }
    /**
     * Gets the requestJustification property value. Justification provided by the end user for the elevation request. For example :'Need to elevate to install microsoft word'. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestJustification() {
        return this.backingStore.get("requestJustification");
    }
    /**
     * Gets the requestLastModifiedDateTime property value. The date and time when the elevation request was either submitted/created or approved/denied. The value cannot be modified and is automatically populated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestLastModifiedDateTime() {
        return this.backingStore.get("requestLastModifiedDateTime");
    }
    /**
     * Gets the reviewCompletedByUserId property value. This is the Azure Active Directory (AAD) user id of the administrator who approved or denied the request. For example: 'F1A57311-B9EB-45B7-9415-8555E68EDC9E'. This field would be String.Empty before the request is either approved or denied. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewCompletedByUserId() {
        return this.backingStore.get("reviewCompletedByUserId");
    }
    /**
     * Gets the reviewCompletedByUserPrincipalName property value. This is the User Principal Name (UPN) of the administrator who approved or denied the request. For example: 'admin@contoso.com'. This field would be String.Empty before the request is either approved or denied. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewCompletedByUserPrincipalName() {
        return this.backingStore.get("reviewCompletedByUserPrincipalName");
    }
    /**
     * Gets the reviewCompletedDateTime property value. The DateTime for which the request was approved or denied. For example, midnight UTC on August 3rd, 2023 would look like this: '2023-08-03T00:00:00Z'. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReviewCompletedDateTime() {
        return this.backingStore.get("reviewCompletedDateTime");
    }
    /**
     * Gets the reviewerJustification property value. An optional justification provided by approver at approval or denied time. This field will be String.Empty if approver decides to not provide a justification. For example: 'Run this installer today'
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReviewerJustification() {
        return this.backingStore.get("reviewerJustification");
    }
    /**
     * Gets the status property value. Indicates state of elevation request
     * @return a ElevationRequestState
     */
    @jakarta.annotation.Nullable
    public ElevationRequestState getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("applicationDetail", this.getApplicationDetail());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("requestCreatedDateTime", this.getRequestCreatedDateTime());
        writer.writeStringValue("requestedByUserId", this.getRequestedByUserId());
        writer.writeStringValue("requestedByUserPrincipalName", this.getRequestedByUserPrincipalName());
        writer.writeStringValue("requestedOnDeviceId", this.getRequestedOnDeviceId());
        writer.writeOffsetDateTimeValue("requestExpiryDateTime", this.getRequestExpiryDateTime());
        writer.writeStringValue("requestJustification", this.getRequestJustification());
        writer.writeOffsetDateTimeValue("requestLastModifiedDateTime", this.getRequestLastModifiedDateTime());
        writer.writeStringValue("reviewCompletedByUserId", this.getReviewCompletedByUserId());
        writer.writeStringValue("reviewCompletedByUserPrincipalName", this.getReviewCompletedByUserPrincipalName());
        writer.writeOffsetDateTimeValue("reviewCompletedDateTime", this.getReviewCompletedDateTime());
        writer.writeStringValue("reviewerJustification", this.getReviewerJustification());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the applicationDetail property value. Details of the application which is being requested to elevate, allowing the admin to understand the identity of the application. It includes file info such as FilePath, FileHash, FilePublisher, and etc. Returned by default. Read-only.
     * @param value Value to set for the applicationDetail property.
     */
    public void setApplicationDetail(@jakarta.annotation.Nullable final ApplicationDetail value) {
        this.backingStore.set("applicationDetail", value);
    }
    /**
     * Sets the deviceName property value. The device name used to initiate the elevation request. For example: 'cotonso-laptop'. Returned by default. Read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the requestCreatedDateTime property value. The date and time when the elevation request was submitted/created. The value cannot be modified and is automatically populated when the elevation request is submitted/created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the requestCreatedDateTime property.
     */
    public void setRequestCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestCreatedDateTime", value);
    }
    /**
     * Sets the requestedByUserId property value. The Azure Active Directory (AAD) identifier of the end user who is requesting this elevation. For example: 'F1A57311-B9EB-45B7-9415-8555E68EDC9E'. Returned by default. Read-only.
     * @param value Value to set for the requestedByUserId property.
     */
    public void setRequestedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestedByUserId", value);
    }
    /**
     * Sets the requestedByUserPrincipalName property value. The User Principal Name (UPN) of the end user who requested this elevation. For example: 'user1@contoso.com'. Returned by default. Read-only.
     * @param value Value to set for the requestedByUserPrincipalName property.
     */
    public void setRequestedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestedByUserPrincipalName", value);
    }
    /**
     * Sets the requestedOnDeviceId property value. The Intune Device Identifier of the managed device used to initiate the elevation request. For example: '90F5F6E8-CA09-4811-97F6-4D0DD532D916'. Returned by default. Read-only.
     * @param value Value to set for the requestedOnDeviceId property.
     */
    public void setRequestedOnDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestedOnDeviceId", value);
    }
    /**
     * Sets the requestExpiryDateTime property value. Expiration set for the request when it was created, regardless of approved or denied status. For example: '2023-08-03T14:24:22Z'. Returned by default. Returned by default. Read-only.
     * @param value Value to set for the requestExpiryDateTime property.
     */
    public void setRequestExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestExpiryDateTime", value);
    }
    /**
     * Sets the requestJustification property value. Justification provided by the end user for the elevation request. For example :'Need to elevate to install microsoft word'. Read-only.
     * @param value Value to set for the requestJustification property.
     */
    public void setRequestJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestJustification", value);
    }
    /**
     * Sets the requestLastModifiedDateTime property value. The date and time when the elevation request was either submitted/created or approved/denied. The value cannot be modified and is automatically populated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     * @param value Value to set for the requestLastModifiedDateTime property.
     */
    public void setRequestLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestLastModifiedDateTime", value);
    }
    /**
     * Sets the reviewCompletedByUserId property value. This is the Azure Active Directory (AAD) user id of the administrator who approved or denied the request. For example: 'F1A57311-B9EB-45B7-9415-8555E68EDC9E'. This field would be String.Empty before the request is either approved or denied. Read-only.
     * @param value Value to set for the reviewCompletedByUserId property.
     */
    public void setReviewCompletedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewCompletedByUserId", value);
    }
    /**
     * Sets the reviewCompletedByUserPrincipalName property value. This is the User Principal Name (UPN) of the administrator who approved or denied the request. For example: 'admin@contoso.com'. This field would be String.Empty before the request is either approved or denied. Read-only.
     * @param value Value to set for the reviewCompletedByUserPrincipalName property.
     */
    public void setReviewCompletedByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewCompletedByUserPrincipalName", value);
    }
    /**
     * Sets the reviewCompletedDateTime property value. The DateTime for which the request was approved or denied. For example, midnight UTC on August 3rd, 2023 would look like this: '2023-08-03T00:00:00Z'. Read-only.
     * @param value Value to set for the reviewCompletedDateTime property.
     */
    public void setReviewCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reviewCompletedDateTime", value);
    }
    /**
     * Sets the reviewerJustification property value. An optional justification provided by approver at approval or denied time. This field will be String.Empty if approver decides to not provide a justification. For example: 'Run this installer today'
     * @param value Value to set for the reviewerJustification property.
     */
    public void setReviewerJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reviewerJustification", value);
    }
    /**
     * Sets the status property value. Indicates state of elevation request
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ElevationRequestState value) {
        this.backingStore.set("status", value);
    }
}
