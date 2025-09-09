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
 * CVE information of QU catalog item
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsQualityUpdateCveSeverityInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsQualityUpdateCveSeverityInformation} and sets the default values.
     */
    public WindowsQualityUpdateCveSeverityInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsQualityUpdateCveSeverityInformation}
     */
    @jakarta.annotation.Nonnull
    public static WindowsQualityUpdateCveSeverityInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsQualityUpdateCveSeverityInformation();
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
     * Gets the exploitedCves property value. Exploit cve details
     * @return a {@link java.util.List<WindowsQualityUpdateCveDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsQualityUpdateCveDetail> getExploitedCves() {
        return this.backingStore.get("exploitedCves");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exploitedCves", (n) -> { this.setExploitedCves(n.getCollectionOfObjectValues(WindowsQualityUpdateCveDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("maxBaseScore", (n) -> { this.setMaxBaseScore(n.getDoubleValue()); });
        deserializerMap.put("maxSeverityLevel", (n) -> { this.setMaxSeverityLevel(n.getEnumValue(WindowsUpdateCveSeverityLevel::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxBaseScore property value. Max base score of CVE
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxBaseScore() {
        return this.backingStore.get("maxBaseScore");
    }
    /**
     * Gets the maxSeverityLevel property value. Max severity of CVE
     * @return a {@link WindowsUpdateCveSeverityLevel}
     */
    @jakarta.annotation.Nullable
    public WindowsUpdateCveSeverityLevel getMaxSeverityLevel() {
        return this.backingStore.get("maxSeverityLevel");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("exploitedCves", this.getExploitedCves());
        writer.writeDoubleValue("maxBaseScore", this.getMaxBaseScore());
        writer.writeEnumValue("maxSeverityLevel", this.getMaxSeverityLevel());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the exploitedCves property value. Exploit cve details
     * @param value Value to set for the exploitedCves property.
     */
    public void setExploitedCves(@jakarta.annotation.Nullable final java.util.List<WindowsQualityUpdateCveDetail> value) {
        this.backingStore.set("exploitedCves", value);
    }
    /**
     * Sets the maxBaseScore property value. Max base score of CVE
     * @param value Value to set for the maxBaseScore property.
     */
    public void setMaxBaseScore(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("maxBaseScore", value);
    }
    /**
     * Sets the maxSeverityLevel property value. Max severity of CVE
     * @param value Value to set for the maxSeverityLevel property.
     */
    public void setMaxSeverityLevel(@jakarta.annotation.Nullable final WindowsUpdateCveSeverityLevel value) {
        this.backingStore.set("maxSeverityLevel", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
