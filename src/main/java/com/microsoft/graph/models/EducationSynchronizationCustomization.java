package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationCustomization implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the display name of the resource can be overwritten by the sync.
     */
    private Boolean allowDisplayNameUpdate;
    /**
     * Indicates whether synchronization of the parent entity is deferred to a later date.
     */
    private Boolean isSyncDeferred;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters
     */
    private java.util.List<String> optionalPropertiesToSync;
    /**
     * The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments
     */
    private OffsetDateTime synchronizationStartDate;
    /**
     * Instantiates a new EducationSynchronizationCustomization and sets the default values.
     */
    public EducationSynchronizationCustomization() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationSynchronizationCustomization
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationCustomization createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationCustomization();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the allowDisplayNameUpdate property value. Indicates whether the display name of the resource can be overwritten by the sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowDisplayNameUpdate() {
        return this.allowDisplayNameUpdate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("allowDisplayNameUpdate", (n) -> { this.setAllowDisplayNameUpdate(n.getBooleanValue()); });
        deserializerMap.put("isSyncDeferred", (n) -> { this.setIsSyncDeferred(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("optionalPropertiesToSync", (n) -> { this.setOptionalPropertiesToSync(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("synchronizationStartDate", (n) -> { this.setSynchronizationStartDate(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSyncDeferred property value. Indicates whether synchronization of the parent entity is deferred to a later date.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSyncDeferred() {
        return this.isSyncDeferred;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the optionalPropertiesToSync property value. The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOptionalPropertiesToSync() {
        return this.optionalPropertiesToSync;
    }
    /**
     * Gets the synchronizationStartDate property value. The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSynchronizationStartDate() {
        return this.synchronizationStartDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowDisplayNameUpdate", this.getAllowDisplayNameUpdate());
        writer.writeBooleanValue("isSyncDeferred", this.getIsSyncDeferred());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("optionalPropertiesToSync", this.getOptionalPropertiesToSync());
        writer.writeOffsetDateTimeValue("synchronizationStartDate", this.getSynchronizationStartDate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the allowDisplayNameUpdate property value. Indicates whether the display name of the resource can be overwritten by the sync.
     * @param value Value to set for the allowDisplayNameUpdate property.
     */
    public void setAllowDisplayNameUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.allowDisplayNameUpdate = value;
    }
    /**
     * Sets the isSyncDeferred property value. Indicates whether synchronization of the parent entity is deferred to a later date.
     * @param value Value to set for the isSyncDeferred property.
     */
    public void setIsSyncDeferred(@jakarta.annotation.Nullable final Boolean value) {
        this.isSyncDeferred = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the optionalPropertiesToSync property value. The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters
     * @param value Value to set for the optionalPropertiesToSync property.
     */
    public void setOptionalPropertiesToSync(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.optionalPropertiesToSync = value;
    }
    /**
     * Sets the synchronizationStartDate property value. The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments
     * @param value Value to set for the synchronizationStartDate property.
     */
    public void setSynchronizationStartDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.synchronizationStartDate = value;
    }
}
