package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiTenantOrganizationJoinRequestRecord extends Entity implements Parsable {
    /**
     * The addedByTenantId property
     */
    private String addedByTenantId;
    /**
     * The memberState property
     */
    private MultiTenantOrganizationMemberState memberState;
    /**
     * The role property
     */
    private MultiTenantOrganizationMemberRole role;
    /**
     * The transitionDetails property
     */
    private MultiTenantOrganizationJoinRequestTransitionDetails transitionDetails;
    /**
     * Instantiates a new multiTenantOrganizationJoinRequestRecord and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationJoinRequestRecord
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationJoinRequestRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationJoinRequestRecord();
    }
    /**
     * Gets the addedByTenantId property value. The addedByTenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAddedByTenantId() {
        return this.addedByTenantId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedByTenantId", (n) -> { this.setAddedByTenantId(n.getStringValue()); });
        deserializerMap.put("memberState", (n) -> { this.setMemberState(n.getEnumValue(MultiTenantOrganizationMemberState.class)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MultiTenantOrganizationMemberRole.class)); });
        deserializerMap.put("transitionDetails", (n) -> { this.setTransitionDetails(n.getObjectValue(MultiTenantOrganizationJoinRequestTransitionDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberState property value. The memberState property
     * @return a multiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getMemberState() {
        return this.memberState;
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
     * Gets the transitionDetails property value. The transitionDetails property
     * @return a multiTenantOrganizationJoinRequestTransitionDetails
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestTransitionDetails getTransitionDetails() {
        return this.transitionDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("addedByTenantId", this.getAddedByTenantId());
        writer.writeEnumValue("memberState", this.getMemberState());
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("transitionDetails", this.getTransitionDetails());
    }
    /**
     * Sets the addedByTenantId property value. The addedByTenantId property
     * @param value Value to set for the addedByTenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAddedByTenantId(@jakarta.annotation.Nullable final String value) {
        this.addedByTenantId = value;
    }
    /**
     * Sets the memberState property value. The memberState property
     * @param value Value to set for the memberState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMemberState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.memberState = value;
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.role = value;
    }
    /**
     * Sets the transitionDetails property value. The transitionDetails property
     * @param value Value to set for the transitionDetails property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTransitionDetails(@jakarta.annotation.Nullable final MultiTenantOrganizationJoinRequestTransitionDetails value) {
        this.transitionDetails = value;
    }
}
