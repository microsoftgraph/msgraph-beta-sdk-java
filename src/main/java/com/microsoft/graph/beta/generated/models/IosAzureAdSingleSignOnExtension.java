package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an Azure AD-type Single Sign-On extension profile for iOS devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosAzureAdSingleSignOnExtension extends IosSingleSignOnExtension implements Parsable {
    /**
     * Instantiates a new IosAzureAdSingleSignOnExtension and sets the default values.
     */
    public IosAzureAdSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.iosAzureAdSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosAzureAdSingleSignOnExtension
     */
    @jakarta.annotation.Nonnull
    public static IosAzureAdSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosAzureAdSingleSignOnExtension();
    }
    /**
     * Gets the bundleIdAccessControlList property value. An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBundleIdAccessControlList() {
        return this.backingStore.get("bundleIdAccessControlList");
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<KeyTypedValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this.backingStore.get("configurations");
    }
    /**
     * Gets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSharedDeviceMode() {
        return this.backingStore.get("enableSharedDeviceMode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleIdAccessControlList", (n) -> { this.setBundleIdAccessControlList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("configurations", (n) -> { this.setConfigurations(n.getCollectionOfObjectValues(KeyTypedValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("enableSharedDeviceMode", (n) -> { this.setEnableSharedDeviceMode(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("bundleIdAccessControlList", this.getBundleIdAccessControlList());
        writer.writeCollectionOfObjectValues("configurations", this.getConfigurations());
        writer.writeBooleanValue("enableSharedDeviceMode", this.getEnableSharedDeviceMode());
    }
    /**
     * Sets the bundleIdAccessControlList property value. An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     * @param value Value to set for the bundleIdAccessControlList property.
     */
    public void setBundleIdAccessControlList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bundleIdAccessControlList", value);
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     */
    public void setConfigurations(@jakarta.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this.backingStore.set("configurations", value);
    }
    /**
     * Sets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @param value Value to set for the enableSharedDeviceMode property.
     */
    public void setEnableSharedDeviceMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableSharedDeviceMode", value);
    }
}
