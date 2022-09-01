package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhoneXAP extends MobileLobApp implements Parsable {
    /** The identity version. */
    private String _identityVersion;
    /** The minimum operating system required for a Windows mobile app. */
    private WindowsMinimumOperatingSystem _minimumSupportedOperatingSystem;
    /** The Product Identifier. */
    private String _productIdentifier;
    /**
     * Instantiates a new WindowsPhoneXAP and sets the default values.
     * @return a void
     */
    public WindowsPhoneXAP() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhoneXAP");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhoneXAP
     */
    @javax.annotation.Nonnull
    public static WindowsPhoneXAP createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhoneXAP();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPhoneXAP currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("identityVersion", (n) -> { currentObject.setIdentityVersion(n.getStringValue()); });
            this.put("minimumSupportedOperatingSystem", (n) -> { currentObject.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
            this.put("productIdentifier", (n) -> { currentObject.setProductIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this._identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a windowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this._minimumSupportedOperatingSystem;
    }
    /**
     * Gets the productIdentifier property value. The Product Identifier.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductIdentifier() {
        return this._productIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("productIdentifier", this.getProductIdentifier());
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this._identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this._minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the productIdentifier property value. The Product Identifier.
     * @param value Value to set for the productIdentifier property.
     * @return a void
     */
    public void setProductIdentifier(@javax.annotation.Nullable final String value) {
        this._productIdentifier = value;
    }
}
