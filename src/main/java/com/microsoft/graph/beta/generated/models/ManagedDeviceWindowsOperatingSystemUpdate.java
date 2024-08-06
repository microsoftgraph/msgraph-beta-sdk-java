package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Updates for different Windows' versions are usually released on the Patch Tuesday or B-week  of each month. This complex type defines the Build-version and the release-date for a particular B-week update of the Windows' version.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceWindowsOperatingSystemUpdate implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ManagedDeviceWindowsOperatingSystemUpdate} and sets the default values.
     */
    public ManagedDeviceWindowsOperatingSystemUpdate() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedDeviceWindowsOperatingSystemUpdate}
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceWindowsOperatingSystemUpdate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceWindowsOperatingSystemUpdate();
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
     * Gets the buildVersion property value. Indicates the build version for associated windows update. Windows Operating System updates are usually released on the Patch Tuesday or B-week of each month. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuildVersion() {
        return this.backingStore.get("buildVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("buildVersion", (n) -> { this.setBuildVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("releaseMonth", (n) -> { this.setReleaseMonth(n.getIntegerValue()); });
        deserializerMap.put("releaseYear", (n) -> { this.setReleaseYear(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the releaseMonth property value. Indicates the Month in which this B-week update was released. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReleaseMonth() {
        return this.backingStore.get("releaseMonth");
    }
    /**
     * Gets the releaseYear property value. Indicates the Year in which this B-week update was released. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReleaseYear() {
        return this.backingStore.get("releaseYear");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buildVersion", this.getBuildVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("releaseMonth", this.getReleaseMonth());
        writer.writeIntegerValue("releaseYear", this.getReleaseYear());
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
     * Sets the buildVersion property value. Indicates the build version for associated windows update. Windows Operating System updates are usually released on the Patch Tuesday or B-week of each month. Read-only.
     * @param value Value to set for the buildVersion property.
     */
    public void setBuildVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("buildVersion", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the releaseMonth property value. Indicates the Month in which this B-week update was released. Read-only.
     * @param value Value to set for the releaseMonth property.
     */
    public void setReleaseMonth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("releaseMonth", value);
    }
    /**
     * Sets the releaseYear property value. Indicates the Year in which this B-week update was released. Read-only.
     * @param value Value to set for the releaseYear property.
     */
    public void setReleaseYear(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("releaseYear", value);
    }
}
