package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base class to detect a Win32 App
 */
public class Win32LobAppPowerShellScriptRequirement extends Win32LobAppRequirement implements Parsable {
    /**
     * Contains all supported Powershell Script output detection type.
     */
    private Win32LobAppPowerShellScriptDetectionType detectionType;
    /**
     * The unique display name for this rule
     */
    private String displayName;
    /**
     * A value indicating whether signature check is enforced
     */
    private Boolean enforceSignatureCheck;
    /**
     * A value indicating whether this script should run as 32-bit
     */
    private Boolean runAs32Bit;
    /**
     * Indicates the type of execution context the app runs in.
     */
    private RunAsAccountType runAsAccount;
    /**
     * The base64 encoded script content to detect Win32 Line of Business (LoB) app
     */
    private String scriptContent;
    /**
     * Instantiates a new win32LobAppPowerShellScriptRequirement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppPowerShellScriptRequirement() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppPowerShellScriptRequirement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppPowerShellScriptRequirement
     */
    @javax.annotation.Nonnull
    public static Win32LobAppPowerShellScriptRequirement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptRequirement();
    }
    /**
     * Gets the detectionType property value. Contains all supported Powershell Script output detection type.
     * @return a win32LobAppPowerShellScriptDetectionType
     */
    @javax.annotation.Nullable
    public Win32LobAppPowerShellScriptDetectionType getDetectionType() {
        return this.detectionType;
    }
    /**
     * Gets the displayName property value. The unique display name for this rule
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this.enforceSignatureCheck;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppPowerShellScriptDetectionType.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforceSignatureCheck", (n) -> { this.setEnforceSignatureCheck(n.getBooleanValue()); });
        deserializerMap.put("runAs32Bit", (n) -> { this.setRunAs32Bit(n.getBooleanValue()); });
        deserializerMap.put("runAsAccount", (n) -> { this.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
        deserializerMap.put("scriptContent", (n) -> { this.setScriptContent(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this.runAs32Bit;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a runAsAccountType
     */
    @javax.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this.runAsAccount;
    }
    /**
     * Gets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScriptContent() {
        return this.scriptContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionType(@javax.annotation.Nullable final Win32LobAppPowerShellScriptDetectionType value) {
        this.detectionType = value;
    }
    /**
     * Sets the displayName property value. The unique display name for this rule
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforceSignatureCheck(@javax.annotation.Nullable final Boolean value) {
        this.enforceSignatureCheck = value;
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunAs32Bit(@javax.annotation.Nullable final Boolean value) {
        this.runAs32Bit = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this.runAsAccount = value;
    }
    /**
     * Sets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScriptContent(@javax.annotation.Nullable final String value) {
        this.scriptContent = value;
    }
}
