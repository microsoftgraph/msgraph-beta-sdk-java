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
 * Represents the build version details of a product revision that is associated with a quality update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateProductBuildVersionDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsQualityUpdateProductBuildVersionDetail} and sets the default values.
     */
    public WindowsQualityUpdateProductBuildVersionDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateProductBuildVersionDetail}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateProductBuildVersionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateProductBuildVersionDetail();
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
     * Gets the buildNumber property value. The build number of the product release, Allowed range is 0 - 2,147,483,647. For example: 19045. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBuildNumber() {
        return this.backingStore.get("buildNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("buildNumber", (n) -> { this.setBuildNumber(n.getIntegerValue()); });
        deserializerMap.put("majorVersionNumber", (n) -> { this.setMajorVersionNumber(n.getIntegerValue()); });
        deserializerMap.put("minorVersionNumber", (n) -> { this.setMinorVersionNumber(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("updateBuildRevision", (n) -> { this.setUpdateBuildRevision(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the majorVersionNumber property value. The major version of the product release, Allowed range is 0 - 2,147,483,647. For example: 10. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMajorVersionNumber() {
        return this.backingStore.get("majorVersionNumber");
    }
    /**
     * Gets the minorVersionNumber property value. The minor version of the product release, Allowed range is 0 - 2,147,483,647. For example: 0. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinorVersionNumber() {
        return this.backingStore.get("minorVersionNumber");
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
     * Gets the updateBuildRevision property value. The update build revision number of the product revision for the corresponding patch, Allowed range is 0 - 2,147,483,647. For example: 4780. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpdateBuildRevision() {
        return this.backingStore.get("updateBuildRevision");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("buildNumber", this.getBuildNumber());
        writer.writeIntegerValue("majorVersionNumber", this.getMajorVersionNumber());
        writer.writeIntegerValue("minorVersionNumber", this.getMinorVersionNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("updateBuildRevision", this.getUpdateBuildRevision());
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
     * Sets the buildNumber property value. The build number of the product release, Allowed range is 0 - 2,147,483,647. For example: 19045. Read-only.
     * @param value Value to set for the buildNumber property.
     */
    public void setBuildNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("buildNumber", value);
    }
    /**
     * Sets the majorVersionNumber property value. The major version of the product release, Allowed range is 0 - 2,147,483,647. For example: 10. Read-only.
     * @param value Value to set for the majorVersionNumber property.
     */
    public void setMajorVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("majorVersionNumber", value);
    }
    /**
     * Sets the minorVersionNumber property value. The minor version of the product release, Allowed range is 0 - 2,147,483,647. For example: 0. Read-only.
     * @param value Value to set for the minorVersionNumber property.
     */
    public void setMinorVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minorVersionNumber", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the updateBuildRevision property value. The update build revision number of the product revision for the corresponding patch, Allowed range is 0 - 2,147,483,647. For example: 4780. Read-only.
     * @param value Value to set for the updateBuildRevision property.
     */
    public void setUpdateBuildRevision(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("updateBuildRevision", value);
    }
}
