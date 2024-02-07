package com.microsoft.graph.beta.models;

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
public class Win32LobAppPowerShellScriptRequirement extends Win32LobAppRequirement implements Parsable {
    /**
     * Instantiates a new Win32LobAppPowerShellScriptRequirement and sets the default values.
     */
    public Win32LobAppPowerShellScriptRequirement() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppPowerShellScriptRequirement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptRequirement
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppPowerShellScriptRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptRequirement();
    }
    /**
     * Gets the detectionType property value. Contains all supported Powershell Script output detection type.
     * @return a Win32LobAppPowerShellScriptDetectionType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppPowerShellScriptDetectionType getDetectionType() {
        return this.backingStore.get("detectionType");
    }
    /**
     * Gets the displayName property value. The unique display name for this rule
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.backingStore.get("enforceSignatureCheck");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppPowerShellScriptDetectionType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType::forValue)); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.backingStore.get("runAs32Bit");
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a RunAsAccountType
     */
    @jakarta.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.backingStore.get("runAsAccount");
    }
    /**
     * Gets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScriptContent() {
        return this.backingStore.get("scriptContent");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("detectionType", this.getDetectionType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeEnumValue("runAsAccount", this.getRunAsAccount());
        writer.writeStringValue("scriptContent", this.getScriptContent());
    }
    /**
     * Sets the detectionType property value. Contains all supported Powershell Script output detection type.
     * @param value Value to set for the detectionType property.
     */
    public void setDetectionType(@jakarta.annotation.Nullable final Win32LobAppPowerShellScriptDetectionType value) {
        this.backingStore.set("detectionType", value);
    }
    /**
     * Sets the displayName property value. The unique display name for this rule
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @param value Value to set for the enforceSignatureCheck property.
     */
    public void setEnforceSignatureCheck(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enforceSignatureCheck", value);
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     */
    public void setRunAs32Bit(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("runAs32Bit", value);
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     */
    public void setRunAsAccount(@jakarta.annotation.Nullable final RunAsAccountType value) {
        this.backingStore.set("runAsAccount", value);
    }
    /**
     * Sets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the scriptContent property.
     */
    public void setScriptContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scriptContent", value);
    }
}
