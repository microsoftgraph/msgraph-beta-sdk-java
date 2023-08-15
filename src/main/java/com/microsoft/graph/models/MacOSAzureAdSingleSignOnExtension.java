package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an Azure AD-type Single Sign-On extension profile for macOS devices.
 */
public class MacOSAzureAdSingleSignOnExtension extends MacOSSingleSignOnExtension implements Parsable {
    /**
     * An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     */
    private java.util.List<String> bundleIdAccessControlList;
    /**
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<KeyTypedValuePair> configurations;
    /**
     * Enables or disables shared device mode.
     */
    private Boolean enableSharedDeviceMode;
    /**
     * Instantiates a new macOSAzureAdSingleSignOnExtension and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSAzureAdSingleSignOnExtension() {
        super();
        this.setOdataType("#microsoft.graph.macOSAzureAdSingleSignOnExtension");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSAzureAdSingleSignOnExtension
     */
    @jakarta.annotation.Nonnull
    public static MacOSAzureAdSingleSignOnExtension createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSAzureAdSingleSignOnExtension();
    }
    /**
     * Gets the bundleIdAccessControlList property value. An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBundleIdAccessControlList() {
        return this.bundleIdAccessControlList;
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a keyTypedValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this.configurations;
    }
    /**
     * Gets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSharedDeviceMode() {
        return this.enableSharedDeviceMode;
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBundleIdAccessControlList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.bundleIdAccessControlList = value;
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConfigurations(@jakarta.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this.configurations = value;
    }
    /**
     * Sets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @param value Value to set for the enableSharedDeviceMode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnableSharedDeviceMode(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSharedDeviceMode = value;
    }
}
