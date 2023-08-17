package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class MultiTenantOrganizationMember extends DirectoryObject implements Parsable {
    /**
     * The addedByTenantId property
     */
    private UUID addedByTenantId;
    /**
     * The addedDateTime property
     */
    private OffsetDateTime addedDateTime;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The joinedDateTime property
     */
    private OffsetDateTime joinedDateTime;
    /**
     * The role property
     */
    private MultiTenantOrganizationMemberRole role;
    /**
     * The state property
     */
    private MultiTenantOrganizationMemberState state;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The transitionDetails property
     */
    private MultiTenantOrganizationMemberTransitionDetails transitionDetails;
    /**
     * Instantiates a new multiTenantOrganizationMember and sets the default values.
     */
    public MultiTenantOrganizationMember() {
        super();
        this.setOdataType("#microsoft.graph.multiTenantOrganizationMember");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationMember
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationMember();
    }
    /**
     * Gets the addedByTenantId property value. The addedByTenantId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAddedByTenantId() {
        return this.addedByTenantId;
    }
    /**
     * Gets the addedDateTime property value. The addedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.addedDateTime;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedByTenantId", (n) -> { this.setAddedByTenantId(n.getUUIDValue()); });
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("joinedDateTime", (n) -> { this.setJoinedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MultiTenantOrganizationMemberRole.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(MultiTenantOrganizationMemberState.class)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("transitionDetails", (n) -> { this.setTransitionDetails(n.getObjectValue(MultiTenantOrganizationMemberTransitionDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the joinedDateTime property value. The joinedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getJoinedDateTime() {
        return this.joinedDateTime;
    }
    /**
     * Gets the role property value. The role property
     * @return a multiTenantOrganizationMemberRole
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getRole() {
        return this.role;
    }
    /**
     * Gets the state property value. The state property
     * @return a multiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getState() {
        return this.state;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the transitionDetails property value. The transitionDetails property
     * @return a multiTenantOrganizationMemberTransitionDetails
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberTransitionDetails getTransitionDetails() {
        return this.transitionDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("addedByTenantId", this.getAddedByTenantId());
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("joinedDateTime", this.getJoinedDateTime());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeObjectValue("transitionDetails", this.getTransitionDetails());
    }
    /**
     * Sets the addedByTenantId property value. The addedByTenantId property
     * @param value Value to set for the addedByTenantId property.
     */
    public void setAddedByTenantId(@jakarta.annotation.Nullable final UUID value) {
        this.addedByTenantId = value;
    }
    /**
     * Sets the addedDateTime property value. The addedDateTime property
     * @param value Value to set for the addedDateTime property.
     */
    public void setAddedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.addedDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the joinedDateTime property value. The joinedDateTime property
     * @param value Value to set for the joinedDateTime property.
     */
    public void setJoinedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.joinedDateTime = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.role = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.state = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the transitionDetails property value. The transitionDetails property
     * @param value Value to set for the transitionDetails property.
     */
    public void setTransitionDetails(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberTransitionDetails value) {
        this.transitionDetails = value;
    }
}
