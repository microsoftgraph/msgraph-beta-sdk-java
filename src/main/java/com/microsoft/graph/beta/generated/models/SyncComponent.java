package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SyncComponent implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SyncComponent} and sets the default values.
     */
    public SyncComponent() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SyncComponent}
     */
    @jakarta.annotation.Nonnull
    public static SyncComponent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SyncComponent();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("moreInfo", (n) -> { this.setMoreInfo(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("reportedDateTime", (n) -> { this.setReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SyncComponentStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the moreInfo property value. Indicates additional information for this sync stage. This is a flexible string that can be null (no additional info), a progress indicator such as &apos;3/6&apos; (completed out of total), or a list of individual item names. Read-only. Nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMoreInfo() {
        return this.backingStore.get("moreInfo");
    }
    /**
     * Gets the name property value. Indicates the sync stage name. The backend abstracts internal infrastructure into 6 user-facing stages. Fixed values are: notifyingDevice, deviceConnecting, policies, applications, scripts, compliance. Read-only. Not nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the reportedDateTime property value. Indicates the date and time when this stage last reported status. The date and time information is shown using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. Not nullable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReportedDateTime() {
        return this.backingStore.get("reportedDateTime");
    }
    /**
     * Gets the status property value. A list of possible status states for a sync infrastructure component or policy during a device sync operation.
     * @return a {@link SyncComponentStatus}
     */
    @jakarta.annotation.Nullable
    public SyncComponentStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the moreInfo property value. Indicates additional information for this sync stage. This is a flexible string that can be null (no additional info), a progress indicator such as &apos;3/6&apos; (completed out of total), or a list of individual item names. Read-only. Nullable.
     * @param value Value to set for the moreInfo property.
     */
    public void setMoreInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("moreInfo", value);
    }
    /**
     * Sets the name property value. Indicates the sync stage name. The backend abstracts internal infrastructure into 6 user-facing stages. Fixed values are: notifyingDevice, deviceConnecting, policies, applications, scripts, compliance. Read-only. Not nullable.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the reportedDateTime property value. Indicates the date and time when this stage last reported status. The date and time information is shown using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: &apos;2014-01-01T00:00:00Z&apos;. Read-only. Not nullable.
     * @param value Value to set for the reportedDateTime property.
     */
    public void setReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("reportedDateTime", value);
    }
    /**
     * Sets the status property value. A list of possible status states for a sync infrastructure component or policy during a device sync operation.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SyncComponentStatus value) {
        this.backingStore.set("status", value);
    }
}
