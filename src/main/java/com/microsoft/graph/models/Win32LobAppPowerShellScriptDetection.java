package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains PowerShell script properties to detect a Win32 App
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppPowerShellScriptDetection extends Win32LobAppDetection implements Parsable {
    /**
     * Instantiates a new Win32LobAppPowerShellScriptDetection and sets the default values.
     */
    public Win32LobAppPowerShellScriptDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppPowerShellScriptDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptDetection
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppPowerShellScriptDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptDetection();
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.BackingStore.get("enforceSignatureCheck");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.BackingStore.get("runAs32Bit");
    }
    /**
     * Gets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptContent() {
        return this.BackingStore.get("scriptContent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeStringValue("scriptContent", this.getScriptContent());
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     */
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("runAs32Bit", value);
    }
    /**
     * Sets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the scriptContent property.
     */
    public void setScriptContent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("scriptContent", value);
    }
}
