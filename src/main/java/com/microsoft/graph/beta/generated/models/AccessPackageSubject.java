package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessPackageSubject extends Entity implements Parsable {
    /**
     * Instantiates a new AccessPackageSubject and sets the default values.
     */
    public AccessPackageSubject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessPackageSubject
     */
    @jakarta.annotation.Nonnull
    public static AccessPackageSubject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessPackageSubject();
    }
    /**
     * Gets the altSecId property value. Not Supported.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAltSecId() {
        return this.backingStore.get("altSecId");
    }
    /**
     * Gets the cleanupScheduledDateTime property value. The date and time the subject is marked to be blocked from sign in or deleted. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCleanupScheduledDateTime() {
        return this.backingStore.get("cleanupScheduledDateTime");
    }
    /**
     * Gets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @return a ConnectedOrganization
     */
    @jakarta.annotation.Nullable
    public ConnectedOrganization getConnectedOrganization() {
        return this.backingStore.get("connectedOrganization");
    }
    /**
     * Gets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectedOrganizationId() {
        return this.backingStore.get("connectedOrganizationId");
    }
    /**
     * Gets the displayName property value. The display name of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email address of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("altSecId", (n) -> { this.setAltSecId(n.getStringValue()); });
        deserializerMap.put("cleanupScheduledDateTime", (n) -> { this.setCleanupScheduledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("connectedOrganization", (n) -> { this.setConnectedOrganization(n.getObjectValue(ConnectedOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("connectedOrganizationId", (n) -> { this.setConnectedOrganizationId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("onPremisesSecurityIdentifier", (n) -> { this.setOnPremisesSecurityIdentifier(n.getStringValue()); });
        deserializerMap.put("principalName", (n) -> { this.setPrincipalName(n.getStringValue()); });
        deserializerMap.put("subjectLifecycle", (n) -> { this.setSubjectLifecycle(n.getEnumValue(AccessPackageSubjectLifecycle::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the objectId property value. The object identifier of the subject. null if the subject isn't yet a user in the tenant. Alternate key.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObjectId() {
        return this.backingStore.get("objectId");
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this.backingStore.get("onPremisesSecurityIdentifier");
    }
    /**
     * Gets the principalName property value. The principal name, if known, of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrincipalName() {
        return this.backingStore.get("principalName");
    }
    /**
     * Gets the subjectLifecycle property value. The lifecycle of the subject user, if a guest. The possible values are: notDefined, notGoverned, governed, unknownFutureValue.
     * @return a AccessPackageSubjectLifecycle
     */
    @jakarta.annotation.Nullable
    public AccessPackageSubjectLifecycle getSubjectLifecycle() {
        return this.backingStore.get("subjectLifecycle");
    }
    /**
     * Gets the type property value. The resource type of the subject.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("altSecId", this.getAltSecId());
        writer.writeOffsetDateTimeValue("cleanupScheduledDateTime", this.getCleanupScheduledDateTime());
        writer.writeObjectValue("connectedOrganization", this.getConnectedOrganization());
        writer.writeStringValue("connectedOrganizationId", this.getConnectedOrganizationId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeStringValue("principalName", this.getPrincipalName());
        writer.writeEnumValue("subjectLifecycle", this.getSubjectLifecycle());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the altSecId property value. Not Supported.
     * @param value Value to set for the altSecId property.
     */
    public void setAltSecId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("altSecId", value);
    }
    /**
     * Sets the cleanupScheduledDateTime property value. The date and time the subject is marked to be blocked from sign in or deleted. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
     * @param value Value to set for the cleanupScheduledDateTime property.
     */
    public void setCleanupScheduledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("cleanupScheduledDateTime", value);
    }
    /**
     * Sets the connectedOrganization property value. The connected organization of the subject. Read-only. Nullable.
     * @param value Value to set for the connectedOrganization property.
     */
    public void setConnectedOrganization(@jakarta.annotation.Nullable final ConnectedOrganization value) {
        this.backingStore.set("connectedOrganization", value);
    }
    /**
     * Sets the connectedOrganizationId property value. The identifier of the connected organization of the subject.
     * @param value Value to set for the connectedOrganizationId property.
     */
    public void setConnectedOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectedOrganizationId", value);
    }
    /**
     * Sets the displayName property value. The display name of the subject.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email address of the subject.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the objectId property value. The object identifier of the subject. null if the subject isn't yet a user in the tenant. Alternate key.
     * @param value Value to set for the objectId property.
     */
    public void setObjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("objectId", value);
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. The onPremisesSecurityIdentifier property
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     */
    public void setOnPremisesSecurityIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesSecurityIdentifier", value);
    }
    /**
     * Sets the principalName property value. The principal name, if known, of the subject.
     * @param value Value to set for the principalName property.
     */
    public void setPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalName", value);
    }
    /**
     * Sets the subjectLifecycle property value. The lifecycle of the subject user, if a guest. The possible values are: notDefined, notGoverned, governed, unknownFutureValue.
     * @param value Value to set for the subjectLifecycle property.
     */
    public void setSubjectLifecycle(@jakarta.annotation.Nullable final AccessPackageSubjectLifecycle value) {
        this.backingStore.set("subjectLifecycle", value);
    }
    /**
     * Sets the type property value. The resource type of the subject.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}
