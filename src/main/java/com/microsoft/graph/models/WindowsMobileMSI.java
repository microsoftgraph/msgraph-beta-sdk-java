package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties and inherited properties for Windows Mobile MSI Line Of Business apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsMobileMSI extends MobileLobApp implements Parsable {
    /**
     * The command line.
     */
    private String commandLine;
    /**
     * The identity version.
     */
    private String identityVersion;
    /**
     * A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     */
    private Boolean ignoreVersionDetection;
    /**
     * The product code.
     */
    private String productCode;
    /**
     * The product version of Windows Mobile MSI Line of Business (LoB) app.
     */
    private String productVersion;
    /**
     * Indicates whether to install a dual-mode MSI in the device context. If true, app will be installed for all users. If false, app will be installed per-user. If null, service will use the MSI package's default install context. In case of dual-mode MSI, this default will be per-user.  Cannot be set for non-dual-mode apps.  Cannot be changed after initial creation of the application.
     */
    private Boolean useDeviceContext;
    /**
     * Instantiates a new WindowsMobileMSI and sets the default values.
     */
    public WindowsMobileMSI() {
        super();
        this.setOdataType("#microsoft.graph.windowsMobileMSI");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsMobileMSI
     */
    @jakarta.annotation.Nonnull
    public static WindowsMobileMSI createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsMobileMSI();
    }
    /**
     * Gets the commandLine property value. The command line.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCommandLine() {
        return this.commandLine;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("commandLine", (n) -> { this.setCommandLine(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("ignoreVersionDetection", (n) -> { this.setIgnoreVersionDetection(n.getBooleanValue()); });
        deserializerMap.put("productCode", (n) -> { this.setProductCode(n.getStringValue()); });
        deserializerMap.put("productVersion", (n) -> { this.setProductVersion(n.getStringValue()); });
        deserializerMap.put("useDeviceContext", (n) -> { this.setUseDeviceContext(n.getBooleanValue()); });
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
     * Gets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreVersionDetection() {
        return this.ignoreVersionDetection;
    }
    /**
     * Gets the productCode property value. The product code.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductCode() {
        return this.productCode;
    }
    /**
     * Gets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductVersion() {
        return this.productVersion;
    }
    /**
     * Gets the useDeviceContext property value. Indicates whether to install a dual-mode MSI in the device context. If true, app will be installed for all users. If false, app will be installed per-user. If null, service will use the MSI package's default install context. In case of dual-mode MSI, this default will be per-user.  Cannot be set for non-dual-mode apps.  Cannot be changed after initial creation of the application.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceContext() {
        return this.useDeviceContext;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("commandLine", this.getCommandLine());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeBooleanValue("ignoreVersionDetection", this.getIgnoreVersionDetection());
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeBooleanValue("useDeviceContext", this.getUseDeviceContext());
    }
    /**
     * Sets the commandLine property value. The command line.
     * @param value Value to set for the commandLine property.
     */
    public void setCommandLine(@jakarta.annotation.Nullable final String value) {
        this.commandLine = value;
    }
    /**
     * Sets the identityVersion property value. The identity version.
     * @param value Value to set for the identityVersion property.
     */
    public void setIdentityVersion(@jakarta.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the ignoreVersionDetection property value. A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for Windows Mobile MSI Line of Business (LoB) apps that use a self update feature.
     * @param value Value to set for the ignoreVersionDetection property.
     */
    public void setIgnoreVersionDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreVersionDetection = value;
    }
    /**
     * Sets the productCode property value. The product code.
     * @param value Value to set for the productCode property.
     */
    public void setProductCode(@jakarta.annotation.Nullable final String value) {
        this.productCode = value;
    }
    /**
     * Sets the productVersion property value. The product version of Windows Mobile MSI Line of Business (LoB) app.
     * @param value Value to set for the productVersion property.
     */
    public void setProductVersion(@jakarta.annotation.Nullable final String value) {
        this.productVersion = value;
    }
    /**
     * Sets the useDeviceContext property value. Indicates whether to install a dual-mode MSI in the device context. If true, app will be installed for all users. If false, app will be installed per-user. If null, service will use the MSI package's default install context. In case of dual-mode MSI, this default will be per-user.  Cannot be set for non-dual-mode apps.  Cannot be changed after initial creation of the application.
     * @param value Value to set for the useDeviceContext property.
     */
    public void setUseDeviceContext(@jakarta.annotation.Nullable final Boolean value) {
        this.useDeviceContext = value;
    }
}
