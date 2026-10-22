package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlanContextLink extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlanContextLink} and sets the default values.
     */
    public PlanContextLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlanContextLink}
     */
    @jakarta.annotation.Nonnull
    public static PlanContextLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlanContextLink();
    }
    /**
     * Gets the associationType property value. Describes how the plan is associated with the surface.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssociationType() {
        return this.backingStore.get("associationType");
    }
    /**
     * Gets the createdDateTime property value. Date and time the context link was created. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the customLinkText property value. Custom text used to render the link, if provided.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomLinkText() {
        return this.backingStore.get("customLinkText");
    }
    /**
     * Gets the displayAs property value. How the context link should be displayed. The possible values are: teamsTab, sharePointPage, meetingNotes, other, unknownFutureValue, loopPage, project. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: loopPage , project.
     * @return a {@link PlannerPlanContextType}
     */
    @jakarta.annotation.Nullable
    public PlannerPlanContextType getDisplayAs() {
        return this.backingStore.get("displayAs");
    }
    /**
     * Gets the displayNameSegments property value. Display name segments used to render where the plan is surfaced.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDisplayNameSegments() {
        return this.backingStore.get("displayNameSegments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("associationType", (n) -> { this.setAssociationType(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customLinkText", (n) -> { this.setCustomLinkText(n.getStringValue()); });
        deserializerMap.put("displayAs", (n) -> { this.setDisplayAs(n.getEnumValue(PlannerPlanContextType::forValue)); });
        deserializerMap.put("displayNameSegments", (n) -> { this.setDisplayNameSegments(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isActive", (n) -> { this.setIsActive(n.getBooleanValue()); });
        deserializerMap.put("isCreation", (n) -> { this.setIsCreation(n.getBooleanValue()); });
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("ownerAppId", (n) -> { this.setOwnerAppId(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isActive property value. Indicates whether the context link is currently active.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsActive() {
        return this.backingStore.get("isActive");
    }
    /**
     * Gets the isCreation property value. Indicates whether this context link represents the original creation surface for the plan.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCreation() {
        return this.backingStore.get("isCreation");
    }
    /**
     * Gets the key property value. Identifier for the context the plan is surfaced in.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.backingStore.get("key");
    }
    /**
     * Gets the ownerAppId property value. Application ID of the app that owns the surface the plan is linked from.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnerAppId() {
        return this.backingStore.get("ownerAppId");
    }
    /**
     * Gets the webUrl property value. URL of the surface where the plan is displayed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("associationType", this.getAssociationType());
        writer.writeStringValue("customLinkText", this.getCustomLinkText());
        writer.writeEnumValue("displayAs", this.getDisplayAs());
        writer.writeCollectionOfPrimitiveValues("displayNameSegments", this.getDisplayNameSegments());
        writer.writeBooleanValue("isActive", this.getIsActive());
        writer.writeBooleanValue("isCreation", this.getIsCreation());
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("ownerAppId", this.getOwnerAppId());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the associationType property value. Describes how the plan is associated with the surface.
     * @param value Value to set for the associationType property.
     */
    public void setAssociationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("associationType", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time the context link was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the customLinkText property value. Custom text used to render the link, if provided.
     * @param value Value to set for the customLinkText property.
     */
    public void setCustomLinkText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customLinkText", value);
    }
    /**
     * Sets the displayAs property value. How the context link should be displayed. The possible values are: teamsTab, sharePointPage, meetingNotes, other, unknownFutureValue, loopPage, project. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: loopPage , project.
     * @param value Value to set for the displayAs property.
     */
    public void setDisplayAs(@jakarta.annotation.Nullable final PlannerPlanContextType value) {
        this.backingStore.set("displayAs", value);
    }
    /**
     * Sets the displayNameSegments property value. Display name segments used to render where the plan is surfaced.
     * @param value Value to set for the displayNameSegments property.
     */
    public void setDisplayNameSegments(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("displayNameSegments", value);
    }
    /**
     * Sets the isActive property value. Indicates whether the context link is currently active.
     * @param value Value to set for the isActive property.
     */
    public void setIsActive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isActive", value);
    }
    /**
     * Sets the isCreation property value. Indicates whether this context link represents the original creation surface for the plan.
     * @param value Value to set for the isCreation property.
     */
    public void setIsCreation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCreation", value);
    }
    /**
     * Sets the key property value. Identifier for the context the plan is surfaced in.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("key", value);
    }
    /**
     * Sets the ownerAppId property value. Application ID of the app that owns the surface the plan is linked from.
     * @param value Value to set for the ownerAppId property.
     */
    public void setOwnerAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ownerAppId", value);
    }
    /**
     * Sets the webUrl property value. URL of the surface where the plan is displayed.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}
