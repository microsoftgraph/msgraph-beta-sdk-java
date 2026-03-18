package com.microsoft.graph.beta.models.security.dlp;

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SessionMetadataInfo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SessionMetadataInfo} and sets the default values.
     */
    public SessionMetadataInfo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SessionMetadataInfo}
     */
    @jakarta.annotation.Nonnull
    public static SessionMetadataInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SessionMetadataInfo();
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
     * Gets the appHost property value. The appHost property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppHost() {
        return this.backingStore.get("appHost");
    }
    /**
     * Gets the appHostCategories property value. The appHostCategories property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAppHostCategories() {
        return this.backingStore.get("appHostCategories");
    }
    /**
     * Gets the appHostFqdn property value. The appHostFqdn property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppHostFqdn() {
        return this.backingStore.get("appHostFqdn");
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
     * Gets the browser property value. The browser property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowser() {
        return this.backingStore.get("browser");
    }
    /**
     * Gets the browserVersion property value. The browserVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrowserVersion() {
        return this.backingStore.get("browserVersion");
    }
    /**
     * Gets the deviceManagementType property value. The deviceManagementType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceManagementType() {
        return this.backingStore.get("deviceManagementType");
    }
    /**
     * Gets the deviceType property value. The deviceType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * Gets the enforcementPlane property value. The enforcementPlane property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnforcementPlane() {
        return this.backingStore.get("enforcementPlane");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("appHost", (n) -> { this.setAppHost(n.getStringValue()); });
        deserializerMap.put("appHostCategories", (n) -> { this.setAppHostCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appHostFqdn", (n) -> { this.setAppHostFqdn(n.getStringValue()); });
        deserializerMap.put("browser", (n) -> { this.setBrowser(n.getStringValue()); });
        deserializerMap.put("browserVersion", (n) -> { this.setBrowserVersion(n.getStringValue()); });
        deserializerMap.put("deviceManagementType", (n) -> { this.setDeviceManagementType(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("enforcementPlane", (n) -> { this.setEnforcementPlane(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("osPlatform", (n) -> { this.setOsPlatform(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
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
     * Gets the osPlatform property value. The osPlatform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsPlatform() {
        return this.backingStore.get("osPlatform");
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appHost", this.getAppHost());
        writer.writeCollectionOfPrimitiveValues("appHostCategories", this.getAppHostCategories());
        writer.writeStringValue("appHostFqdn", this.getAppHostFqdn());
        writer.writeStringValue("browser", this.getBrowser());
        writer.writeStringValue("browserVersion", this.getBrowserVersion());
        writer.writeStringValue("deviceManagementType", this.getDeviceManagementType());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeStringValue("enforcementPlane", this.getEnforcementPlane());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("osPlatform", this.getOsPlatform());
        writer.writeStringValue("osVersion", this.getOsVersion());
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
     * Sets the appHost property value. The appHost property
     * @param value Value to set for the appHost property.
     */
    public void setAppHost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appHost", value);
    }
    /**
     * Sets the appHostCategories property value. The appHostCategories property
     * @param value Value to set for the appHostCategories property.
     */
    public void setAppHostCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("appHostCategories", value);
    }
    /**
     * Sets the appHostFqdn property value. The appHostFqdn property
     * @param value Value to set for the appHostFqdn property.
     */
    public void setAppHostFqdn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appHostFqdn", value);
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
     * Sets the browser property value. The browser property
     * @param value Value to set for the browser property.
     */
    public void setBrowser(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browser", value);
    }
    /**
     * Sets the browserVersion property value. The browserVersion property
     * @param value Value to set for the browserVersion property.
     */
    public void setBrowserVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("browserVersion", value);
    }
    /**
     * Sets the deviceManagementType property value. The deviceManagementType property
     * @param value Value to set for the deviceManagementType property.
     */
    public void setDeviceManagementType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceManagementType", value);
    }
    /**
     * Sets the deviceType property value. The deviceType property
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the enforcementPlane property value. The enforcementPlane property
     * @param value Value to set for the enforcementPlane property.
     */
    public void setEnforcementPlane(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enforcementPlane", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the osPlatform property value. The osPlatform property
     * @param value Value to set for the osPlatform property.
     */
    public void setOsPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osPlatform", value);
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
}
