package com.microsoft.graph.beta.directory.templates.devicetemplates.item.createdevicefromtemplate;

import com.microsoft.graph.beta.models.KeyCredential;
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
public class CreateDeviceFromTemplatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CreateDeviceFromTemplatePostRequestBody} and sets the default values.
     */
    public CreateDeviceFromTemplatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreateDeviceFromTemplatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static CreateDeviceFromTemplatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateDeviceFromTemplatePostRequestBody();
    }
    /**
     * Gets the accountEnabled property value. The accountEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.backingStore.get("accountEnabled");
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
     * Gets the alternativeNames property value. The alternativeNames property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this.backingStore.get("alternativeNames");
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
     * Gets the externalDeviceId property value. The externalDeviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalDeviceId() {
        return this.backingStore.get("externalDeviceId");
    }
    /**
     * Gets the externalSourceName property value. The externalSourceName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalSourceName() {
        return this.backingStore.get("externalSourceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("alternativeNames", (n) -> { this.setAlternativeNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("externalDeviceId", (n) -> { this.setExternalDeviceId(n.getStringValue()); });
        deserializerMap.put("externalSourceName", (n) -> { this.setExternalSourceName(n.getStringValue()); });
        deserializerMap.put("keyCredential", (n) -> { this.setKeyCredential(n.getObjectValue(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyCredential property value. The keyCredential property
     * @return a {@link KeyCredential}
     */
    @jakarta.annotation.Nullable
    public KeyCredential getKeyCredential() {
        return this.backingStore.get("keyCredential");
    }
    /**
     * Gets the operatingSystemVersion property value. The operatingSystemVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.backingStore.get("operatingSystemVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfPrimitiveValues("alternativeNames", this.getAlternativeNames());
        writer.writeStringValue("externalDeviceId", this.getExternalDeviceId());
        writer.writeStringValue("externalSourceName", this.getExternalSourceName());
        writer.writeObjectValue("keyCredential", this.getKeyCredential());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountEnabled property value. The accountEnabled property
     * @param value Value to set for the accountEnabled property.
     */
    public void setAccountEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accountEnabled", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alternativeNames property value. The alternativeNames property
     * @param value Value to set for the alternativeNames property.
     */
    public void setAlternativeNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("alternativeNames", value);
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
     * Sets the externalDeviceId property value. The externalDeviceId property
     * @param value Value to set for the externalDeviceId property.
     */
    public void setExternalDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalDeviceId", value);
    }
    /**
     * Sets the externalSourceName property value. The externalSourceName property
     * @param value Value to set for the externalSourceName property.
     */
    public void setExternalSourceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalSourceName", value);
    }
    /**
     * Sets the keyCredential property value. The keyCredential property
     * @param value Value to set for the keyCredential property.
     */
    public void setKeyCredential(@jakarta.annotation.Nullable final KeyCredential value) {
        this.backingStore.set("keyCredential", value);
    }
    /**
     * Sets the operatingSystemVersion property value. The operatingSystemVersion property
     * @param value Value to set for the operatingSystemVersion property.
     */
    public void setOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystemVersion", value);
    }
}
