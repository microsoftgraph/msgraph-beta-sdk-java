package com.microsoft.graph.models;

import com.microsoft.graph.models.security.BehaviorDuringRetentionPeriod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RetentionLabelSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The behaviorDuringRetentionPeriod property
     */
    private BehaviorDuringRetentionPeriod behaviorDuringRetentionPeriod;
    /**
     * The isContentUpdateAllowed property
     */
    private Boolean isContentUpdateAllowed;
    /**
     * The isDeleteAllowed property
     */
    private Boolean isDeleteAllowed;
    /**
     * The isLabelUpdateAllowed property
     */
    private Boolean isLabelUpdateAllowed;
    /**
     * The isMetadataUpdateAllowed property
     */
    private Boolean isMetadataUpdateAllowed;
    /**
     * The isRecordLocked property
     */
    private Boolean isRecordLocked;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new retentionLabelSettings and sets the default values.
     */
    public RetentionLabelSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a retentionLabelSettings
     */
    @jakarta.annotation.Nonnull
    public static RetentionLabelSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RetentionLabelSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the behaviorDuringRetentionPeriod property value. The behaviorDuringRetentionPeriod property
     * @return a behaviorDuringRetentionPeriod
     */
    @jakarta.annotation.Nullable
    public BehaviorDuringRetentionPeriod getBehaviorDuringRetentionPeriod() {
        return this.behaviorDuringRetentionPeriod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("behaviorDuringRetentionPeriod", (n) -> { this.setBehaviorDuringRetentionPeriod(n.getEnumValue(BehaviorDuringRetentionPeriod.class)); });
        deserializerMap.put("isContentUpdateAllowed", (n) -> { this.setIsContentUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isDeleteAllowed", (n) -> { this.setIsDeleteAllowed(n.getBooleanValue()); });
        deserializerMap.put("isLabelUpdateAllowed", (n) -> { this.setIsLabelUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isMetadataUpdateAllowed", (n) -> { this.setIsMetadataUpdateAllowed(n.getBooleanValue()); });
        deserializerMap.put("isRecordLocked", (n) -> { this.setIsRecordLocked(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isContentUpdateAllowed property value. The isContentUpdateAllowed property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsContentUpdateAllowed() {
        return this.isContentUpdateAllowed;
    }
    /**
     * Gets the isDeleteAllowed property value. The isDeleteAllowed property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleteAllowed() {
        return this.isDeleteAllowed;
    }
    /**
     * Gets the isLabelUpdateAllowed property value. The isLabelUpdateAllowed property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsLabelUpdateAllowed() {
        return this.isLabelUpdateAllowed;
    }
    /**
     * Gets the isMetadataUpdateAllowed property value. The isMetadataUpdateAllowed property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMetadataUpdateAllowed() {
        return this.isMetadataUpdateAllowed;
    }
    /**
     * Gets the isRecordLocked property value. The isRecordLocked property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRecordLocked() {
        return this.isRecordLocked;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("behaviorDuringRetentionPeriod", this.getBehaviorDuringRetentionPeriod());
        writer.writeBooleanValue("isContentUpdateAllowed", this.getIsContentUpdateAllowed());
        writer.writeBooleanValue("isDeleteAllowed", this.getIsDeleteAllowed());
        writer.writeBooleanValue("isLabelUpdateAllowed", this.getIsLabelUpdateAllowed());
        writer.writeBooleanValue("isMetadataUpdateAllowed", this.getIsMetadataUpdateAllowed());
        writer.writeBooleanValue("isRecordLocked", this.getIsRecordLocked());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the behaviorDuringRetentionPeriod property value. The behaviorDuringRetentionPeriod property
     * @param value Value to set for the behaviorDuringRetentionPeriod property.
     */
    public void setBehaviorDuringRetentionPeriod(@jakarta.annotation.Nullable final BehaviorDuringRetentionPeriod value) {
        this.behaviorDuringRetentionPeriod = value;
    }
    /**
     * Sets the isContentUpdateAllowed property value. The isContentUpdateAllowed property
     * @param value Value to set for the isContentUpdateAllowed property.
     */
    public void setIsContentUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isContentUpdateAllowed = value;
    }
    /**
     * Sets the isDeleteAllowed property value. The isDeleteAllowed property
     * @param value Value to set for the isDeleteAllowed property.
     */
    public void setIsDeleteAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeleteAllowed = value;
    }
    /**
     * Sets the isLabelUpdateAllowed property value. The isLabelUpdateAllowed property
     * @param value Value to set for the isLabelUpdateAllowed property.
     */
    public void setIsLabelUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isLabelUpdateAllowed = value;
    }
    /**
     * Sets the isMetadataUpdateAllowed property value. The isMetadataUpdateAllowed property
     * @param value Value to set for the isMetadataUpdateAllowed property.
     */
    public void setIsMetadataUpdateAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.isMetadataUpdateAllowed = value;
    }
    /**
     * Sets the isRecordLocked property value. The isRecordLocked property
     * @param value Value to set for the isRecordLocked property.
     */
    public void setIsRecordLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.isRecordLocked = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
