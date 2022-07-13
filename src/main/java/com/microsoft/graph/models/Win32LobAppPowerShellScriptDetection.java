package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppPowerShellScriptDetection extends Win32LobAppDetection implements Parsable {
    /** A value indicating whether signature check is enforced */
    private Boolean _enforceSignatureCheck;
    /** A value indicating whether this script should run as 32-bit */
    private Boolean _runAs32Bit;
    /** The base64 encoded script content to detect Win32 Line of Business (LoB) app */
    private String _scriptContent;
    /**
     * Instantiates a new Win32LobAppPowerShellScriptDetection and sets the default values.
     * @return a void
     */
    public Win32LobAppPowerShellScriptDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppPowerShellScriptDetection
     */
    @javax.annotation.Nonnull
    public static Win32LobAppPowerShellScriptDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppPowerShellScriptDetection();
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
        final Win32LobAppPowerShellScriptDetection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("enforceSignatureCheck", (n) -> { currentObject.setEnforceSignatureCheck(n.getBooleanValue()); });
            this.put("runAs32Bit", (n) -> { currentObject.setRunAs32Bit(n.getBooleanValue()); });
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
        writer.writeBooleanValue("enforceSignatureCheck", this.getEnforceSignatureCheck());
        writer.writeBooleanValue("runAs32Bit", this.getRunAs32Bit());
        writer.writeStringValue("scriptContent", this.getScriptContent());
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
     * Sets the scriptContent property value. The base64 encoded script content to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the scriptContent property.
     * @return a void
     */
    public void setScriptContent(@javax.annotation.Nullable final String value) {
        this._scriptContent = value;
    }
}
