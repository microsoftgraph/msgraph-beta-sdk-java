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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoginPageBrandingVisualElement implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link LoginPageBrandingVisualElement} and sets the default values.
     */
    public LoginPageBrandingVisualElement() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LoginPageBrandingVisualElement}
     */
    @jakarta.annotation.Nonnull
    public static LoginPageBrandingVisualElement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoginPageBrandingVisualElement();
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
     * Gets the customText property value. A string to replace the default visual element text that is displayed on the login page. The text must be in Unicode format. Maximum length: 256.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomText() {
        return this.backingStore.get("customText");
    }
    /**
     * Gets the customUrl property value. A custom URL to replace the default URL of the visual element hyperlink. This URL must be in ASCII format or non-ASCII characters must be URL encoded. Maximum length: 128.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomUrl() {
        return this.backingStore.get("customUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("customText", (n) -> { this.setCustomText(n.getStringValue()); });
        deserializerMap.put("customUrl", (n) -> { this.setCustomUrl(n.getStringValue()); });
        deserializerMap.put("isHidden", (n) -> { this.setIsHidden(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isHidden property value. Option to hide the visual element on the login page.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHidden() {
        return this.backingStore.get("isHidden");
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
        writer.writeStringValue("customText", this.getCustomText());
        writer.writeStringValue("customUrl", this.getCustomUrl());
        writer.writeBooleanValue("isHidden", this.getIsHidden());
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
     * Sets the customText property value. A string to replace the default visual element text that is displayed on the login page. The text must be in Unicode format. Maximum length: 256.
     * @param value Value to set for the customText property.
     */
    public void setCustomText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customText", value);
    }
    /**
     * Sets the customUrl property value. A custom URL to replace the default URL of the visual element hyperlink. This URL must be in ASCII format or non-ASCII characters must be URL encoded. Maximum length: 128.
     * @param value Value to set for the customUrl property.
     */
    public void setCustomUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customUrl", value);
    }
    /**
     * Sets the isHidden property value. Option to hide the visual element on the login page.
     * @param value Value to set for the isHidden property.
     */
    public void setIsHidden(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHidden", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
