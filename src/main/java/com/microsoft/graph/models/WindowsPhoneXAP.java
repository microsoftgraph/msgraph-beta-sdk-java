package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Phone XAP Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhoneXAP extends MobileLobApp implements Parsable {
    /**
     * The identity version.
     */
    private String identityVersion;
    /**
     * The minimum operating system required for a Windows mobile app.
     */
    private WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * The Product Identifier.
     */
    private String productIdentifier;
    /**
     * Instantiates a new WindowsPhoneXAP and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static WindowsPhoneXAP createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhoneXAP();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("productIdentifier", (n) -> { this.setProductIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityVersion property value. The identity version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a WindowsMinimumOperatingSystem
     */
    @jakarta.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
    }
    /**
     * Gets the productIdentifier property value. The Product Identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductIdentifier() {
        return this.productIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
        writer.writeStringValue("productIdentifier", this.getProductIdentifier());
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     */
    public void setMinimumSupportedOperatingSystem(@jakarta.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
    /**
     * Sets the productIdentifier property value. The Product Identifier.
     * @param value Value to set for the productIdentifier property.
     */
    public void setProductIdentifier(@jakarta.annotation.Nullable final String value) {
        this.productIdentifier = value;
    }
}
