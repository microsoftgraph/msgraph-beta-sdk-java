package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SelfServiceSignUp extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SelfServiceSignUp} and sets the default values.
     */
    public SelfServiceSignUp() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SelfServiceSignUp}
     */
    @jakarta.annotation.Nonnull
    public static SelfServiceSignUp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SelfServiceSignUp();
    }
    /**
     * Gets the appDisplayName property value. App name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. Unique GUID that represents the app ID in the Microsoft Entra ID.  Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the appliedEventListeners property value. Detailed information about the listeners, such as Azure Logic Apps and Azure Functions, which the corresponding events in the sign-up event triggered.
     * @return a {@link java.util.List<AppliedAuthenticationEventListener>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedAuthenticationEventListener> getAppliedEventListeners() {
        return this.backingStore.get("appliedEventListeners");
    }
    /**
     * Gets the correlationId property value. The request ID sent from the client when the sign-up is initiated. Used to troubleshoot sign-up activity.  Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * Gets the createdDateTime property value. Date and time (UTC) the sign-up was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appliedEventListeners", (n) -> { this.setAppliedEventListeners(n.getCollectionOfObjectValues(AppliedAuthenticationEventListener::createFromDiscriminatorValue)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("signUpIdentity", (n) -> { this.setSignUpIdentity(n.getObjectValue(SignUpIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("signUpIdentityProvider", (n) -> { this.setSignUpIdentityProvider(n.getStringValue()); });
        deserializerMap.put("signUpStage", (n) -> { this.setSignUpStage(n.getEnumValue(SignUpStage::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SignUpStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userSnapshot", (n) -> { this.setUserSnapshot(n.getObjectValue(CiamUserSnapshot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signUpIdentity property value. Unique identifier for self-service sign-up user. Supports $filter (eq) on the signUpIdentifierType.
     * @return a {@link SignUpIdentity}
     */
    @jakarta.annotation.Nullable
    public SignUpIdentity getSignUpIdentity() {
        return this.backingStore.get("signUpIdentity");
    }
    /**
     * Gets the signUpIdentityProvider property value. Describes the type of account for which the user registered. Values include Email OTP, Email Password, Google.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignUpIdentityProvider() {
        return this.backingStore.get("signUpIdentityProvider");
    }
    /**
     * Gets the signUpStage property value. The signUpStage property
     * @return a {@link SignUpStage}
     */
    @jakarta.annotation.Nullable
    public SignUpStage getSignUpStage() {
        return this.backingStore.get("signUpStage");
    }
    /**
     * Gets the status property value. Sign-up status. Includes the error code and description of the error (if a sign-up failure or interrupt occurs).  Supports $filter (eq) on errorCode property.
     * @return a {@link SignUpStatus}
     */
    @jakarta.annotation.Nullable
    public SignUpStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the userSnapshot property value. The userSnapshot property
     * @return a {@link CiamUserSnapshot}
     */
    @jakarta.annotation.Nullable
    public CiamUserSnapshot getUserSnapshot() {
        return this.backingStore.get("userSnapshot");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("appliedEventListeners", this.getAppliedEventListeners());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("signUpIdentity", this.getSignUpIdentity());
        writer.writeStringValue("signUpIdentityProvider", this.getSignUpIdentityProvider());
        writer.writeEnumValue("signUpStage", this.getSignUpStage());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeObjectValue("userSnapshot", this.getUserSnapshot());
    }
    /**
     * Sets the appDisplayName property value. App name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. Unique GUID that represents the app ID in the Microsoft Entra ID.  Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the appliedEventListeners property value. Detailed information about the listeners, such as Azure Logic Apps and Azure Functions, which the corresponding events in the sign-up event triggered.
     * @param value Value to set for the appliedEventListeners property.
     */
    public void setAppliedEventListeners(@jakarta.annotation.Nullable final java.util.List<AppliedAuthenticationEventListener> value) {
        this.backingStore.set("appliedEventListeners", value);
    }
    /**
     * Sets the correlationId property value. The request ID sent from the client when the sign-up is initiated. Used to troubleshoot sign-up activity.  Supports $filter (eq).
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time (UTC) the sign-up was initiated. Example: midnight on Jan 1, 2014 is reported as 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the signUpIdentity property value. Unique identifier for self-service sign-up user. Supports $filter (eq) on the signUpIdentifierType.
     * @param value Value to set for the signUpIdentity property.
     */
    public void setSignUpIdentity(@jakarta.annotation.Nullable final SignUpIdentity value) {
        this.backingStore.set("signUpIdentity", value);
    }
    /**
     * Sets the signUpIdentityProvider property value. Describes the type of account for which the user registered. Values include Email OTP, Email Password, Google.
     * @param value Value to set for the signUpIdentityProvider property.
     */
    public void setSignUpIdentityProvider(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signUpIdentityProvider", value);
    }
    /**
     * Sets the signUpStage property value. The signUpStage property
     * @param value Value to set for the signUpStage property.
     */
    public void setSignUpStage(@jakarta.annotation.Nullable final SignUpStage value) {
        this.backingStore.set("signUpStage", value);
    }
    /**
     * Sets the status property value. Sign-up status. Includes the error code and description of the error (if a sign-up failure or interrupt occurs).  Supports $filter (eq) on errorCode property.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignUpStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the userSnapshot property value. The userSnapshot property
     * @param value Value to set for the userSnapshot property.
     */
    public void setUserSnapshot(@jakarta.annotation.Nullable final CiamUserSnapshot value) {
        this.backingStore.set("userSnapshot", value);
    }
}
