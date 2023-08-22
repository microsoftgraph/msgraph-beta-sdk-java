package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemRetentionLabel extends Entity implements Parsable {
    /**
     * The isLabelAppliedExplicitly property
     */
    private Boolean isLabelAppliedExplicitly;
    /**
     * The labelAppliedBy property
     */
    private IdentitySet labelAppliedBy;
    /**
     * The labelAppliedDateTime property
     */
    private OffsetDateTime labelAppliedDateTime;
    /**
     * The name property
     */
    private String name;
    /**
     * The retentionSettings property
     */
    private RetentionLabelSettings retentionSettings;
    /**
     * Instantiates a new itemRetentionLabel and sets the default values.
     */
    public ItemRetentionLabel() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemRetentionLabel
     */
    @jakarta.annotation.Nonnull
    public static ItemRetentionLabel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemRetentionLabel();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isLabelAppliedExplicitly", (n) -> { this.setIsLabelAppliedExplicitly(n.getBooleanValue()); });
        deserializerMap.put("labelAppliedBy", (n) -> { this.setLabelAppliedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("labelAppliedDateTime", (n) -> { this.setLabelAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("retentionSettings", (n) -> { this.setRetentionSettings(n.getObjectValue(RetentionLabelSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isLabelAppliedExplicitly property value. The isLabelAppliedExplicitly property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLabelAppliedExplicitly() {
        return this.isLabelAppliedExplicitly;
    }
    /**
     * Gets the labelAppliedBy property value. The labelAppliedBy property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLabelAppliedBy() {
        return this.labelAppliedBy;
    }
    /**
     * Gets the labelAppliedDateTime property value. The labelAppliedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLabelAppliedDateTime() {
        return this.labelAppliedDateTime;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the retentionSettings property value. The retentionSettings property
     * @return a retentionLabelSettings
     */
    @jakarta.annotation.Nullable
    public RetentionLabelSettings getRetentionSettings() {
        return this.retentionSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isLabelAppliedExplicitly", this.getIsLabelAppliedExplicitly());
        writer.writeObjectValue("labelAppliedBy", this.getLabelAppliedBy());
        writer.writeOffsetDateTimeValue("labelAppliedDateTime", this.getLabelAppliedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("retentionSettings", this.getRetentionSettings());
    }
    /**
     * Sets the isLabelAppliedExplicitly property value. The isLabelAppliedExplicitly property
     * @param value Value to set for the isLabelAppliedExplicitly property.
     */
    public void setIsLabelAppliedExplicitly(@jakarta.annotation.Nullable final Boolean value) {
        this.isLabelAppliedExplicitly = value;
    }
    /**
     * Sets the labelAppliedBy property value. The labelAppliedBy property
     * @param value Value to set for the labelAppliedBy property.
     */
    public void setLabelAppliedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.labelAppliedBy = value;
    }
    /**
     * Sets the labelAppliedDateTime property value. The labelAppliedDateTime property
     * @param value Value to set for the labelAppliedDateTime property.
     */
    public void setLabelAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.labelAppliedDateTime = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the retentionSettings property value. The retentionSettings property
     * @param value Value to set for the retentionSettings property.
     */
    public void setRetentionSettings(@jakarta.annotation.Nullable final RetentionLabelSettings value) {
        this.retentionSettings = value;
    }
}
