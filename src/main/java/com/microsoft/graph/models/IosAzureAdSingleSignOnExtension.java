package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosAzureAdSingleSignOnExtension extends IosSingleSignOnExtension implements Parsable {
    /** An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on. */
    private java.util.List<String> _bundleIdAccessControlList;
    /** Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements. */
    private java.util.List<KeyTypedValuePair> _configurations;
    /** Enables or disables shared device mode. */
    private Boolean _enableSharedDeviceMode;
    /**
     * Instantiates a new IosAzureAdSingleSignOnExtension and sets the default values.
     * @return a void
     */
    public IosAzureAdSingleSignOnExtension() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosAzureAdSingleSignOnExtension
     */
    @javax.annotation.Nonnull
    public static IosAzureAdSingleSignOnExtension createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosAzureAdSingleSignOnExtension();
    }
    /**
     * Gets the bundleIdAccessControlList property value. An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBundleIdAccessControlList() {
        return this._bundleIdAccessControlList;
    }
    /**
     * Gets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @return a keyTypedValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyTypedValuePair> getConfigurations() {
        return this._configurations;
    }
    /**
     * Gets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSharedDeviceMode() {
        return this._enableSharedDeviceMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosAzureAdSingleSignOnExtension currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("bundleIdAccessControlList", (n) -> { currentObject.setBundleIdAccessControlList(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("configurations", (n) -> { currentObject.setConfigurations(n.getCollectionOfObjectValues(KeyTypedValuePair::createFromDiscriminatorValue)); });
            this.put("enableSharedDeviceMode", (n) -> { currentObject.setEnableSharedDeviceMode(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setBundleIdAccessControlList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._bundleIdAccessControlList = value;
    }
    /**
     * Sets the configurations property value. Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the configurations property.
     * @return a void
     */
    public void setConfigurations(@javax.annotation.Nullable final java.util.List<KeyTypedValuePair> value) {
        this._configurations = value;
    }
    /**
     * Sets the enableSharedDeviceMode property value. Enables or disables shared device mode.
     * @param value Value to set for the enableSharedDeviceMode property.
     * @return a void
     */
    public void setEnableSharedDeviceMode(@javax.annotation.Nullable final Boolean value) {
        this._enableSharedDeviceMode = value;
    }
}
