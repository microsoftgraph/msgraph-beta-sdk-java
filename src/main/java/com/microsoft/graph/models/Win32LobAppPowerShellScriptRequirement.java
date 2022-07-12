package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppPowerShellScriptRequirement extends Win32LobAppRequirement implements Parsable {
    /** Contains all supported Powershell Script output detection type. */
    private Win32LobAppPowerShellScriptDetectionType _detectionType;
    /** The unique display name for this rule */
    private String _displayName;
    /** A value indicating whether signature check is enforced */
    private Boolean _enforceSignatureCheck;
    /** A value indicating whether this script should run as 32-bit */
    private Boolean _runAs32Bit;
    /** Indicates the type of execution context the app runs in. */
    private RunAsAccountType _runAsAccount;
    /** The base64 encoded script content to detect Win32 Line of Business (LoB) app */
    private String _scriptContent;
    /**
     * Instantiates a new Win32LobAppPowerShellScriptRequirement and sets the default values.
     * @return a void
     */
    public Win32LobAppPowerShellScriptRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptRequirement
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
        return this._detectionType;
    }
    /**
     * Gets the displayName property value. The unique display name for this rule
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforceSignatureCheck() {
        return this._enforceSignatureCheck;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppPowerShellScriptRequirement currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("detectionType", (n) -> { currentObject.setDetectionType(n.getEnumValue(Win32LobAppPowerShellScriptDetectionType.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enforceSignatureCheck", (n) -> { currentObject.setEnforceSignatureCheck(n.getBooleanValue()); });
            this.put("runAs32Bit", (n) -> { currentObject.setRunAs32Bit(n.getBooleanValue()); });
            this.put("runAsAccount", (n) -> { currentObject.setRunAsAccount(n.getEnumValue(RunAsAccountType.class)); });
            this.put("scriptContent", (n) -> { currentObject.setScriptContent(n.getStringValue()); });
        }};
    }
    /**
     * Gets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunAs32Bit() {
        return this._runAs32Bit;
    }
    /**
     * Gets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @return a runAsAccountType
     */
    @javax.annotation.Nullable
    public RunAsAccountType getRunAsAccount() {
        return this._runAsAccount;
    }
    /**
     * Gets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScriptContent() {
        return this._scriptContent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDetectionType(@javax.annotation.Nullable final Win32LobAppPowerShellScriptDetectionType value) {
        this._detectionType = value;
    }
    /**
     * Sets the displayName property value. The unique display name for this rule
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enforceSignatureCheck property value. A value indicating whether signature check is enforced
     * @param value Value to set for the enforceSignatureCheck property.
     * @return a void
     */
    public void setEnforceSignatureCheck(@javax.annotation.Nullable final Boolean value) {
        this._enforceSignatureCheck = value;
    }
    /**
     * Sets the runAs32Bit property value. A value indicating whether this script should run as 32-bit
     * @param value Value to set for the runAs32Bit property.
     * @return a void
     */
    public void setRunAs32Bit(@javax.annotation.Nullable final Boolean value) {
        this._runAs32Bit = value;
    }
    /**
     * Sets the runAsAccount property value. Indicates the type of execution context the app runs in.
     * @param value Value to set for the runAsAccount property.
     * @return a void
     */
    public void setRunAsAccount(@javax.annotation.Nullable final RunAsAccountType value) {
        this._runAsAccount = value;
    }
    /**
     * Sets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    public void setScriptContent(@javax.annotation.Nullable final String value) {
        this._scriptContent = value;
    }
}
