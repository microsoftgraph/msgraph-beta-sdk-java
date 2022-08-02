package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EncryptWithUserDefinedRights extends EncryptContent implements Parsable {
    /** The allowAdHocPermissions property */
    private Boolean _allowAdHocPermissions;
    /** The allowMailForwarding property */
    private Boolean _allowMailForwarding;
    /** The decryptionRightsManagementTemplateId property */
    private String _decryptionRightsManagementTemplateId;
    /**
     * Instantiates a new EncryptWithUserDefinedRights and sets the default values.
     * @return a void
     */
    public EncryptWithUserDefinedRights() {
        super();
        this.setOdataType("#microsoft.graph.encryptWithUserDefinedRights");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptWithUserDefinedRights
     */
    @javax.annotation.Nonnull
    public static EncryptWithUserDefinedRights createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptWithUserDefinedRights();
    }
    /**
     * Gets the allowAdHocPermissions property value. The allowAdHocPermissions property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAdHocPermissions() {
        return this._allowAdHocPermissions;
    }
    /**
     * Gets the allowMailForwarding property value. The allowMailForwarding property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowMailForwarding() {
        return this._allowMailForwarding;
    }
    /**
     * Gets the decryptionRightsManagementTemplateId property value. The decryptionRightsManagementTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDecryptionRightsManagementTemplateId() {
        return this._decryptionRightsManagementTemplateId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EncryptWithUserDefinedRights currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowAdHocPermissions", (n) -> { currentObject.setAllowAdHocPermissions(n.getBooleanValue()); });
            this.put("allowMailForwarding", (n) -> { currentObject.setAllowMailForwarding(n.getBooleanValue()); });
            this.put("decryptionRightsManagementTemplateId", (n) -> { currentObject.setDecryptionRightsManagementTemplateId(n.getStringValue()); });
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
        writer.writeBooleanValue("allowAdHocPermissions", this.getAllowAdHocPermissions());
        writer.writeBooleanValue("allowMailForwarding", this.getAllowMailForwarding());
        writer.writeStringValue("decryptionRightsManagementTemplateId", this.getDecryptionRightsManagementTemplateId());
    }
    /**
     * Sets the allowAdHocPermissions property value. The allowAdHocPermissions property
     * @param value Value to set for the allowAdHocPermissions property.
     * @return a void
     */
    public void setAllowAdHocPermissions(@javax.annotation.Nullable final Boolean value) {
        this._allowAdHocPermissions = value;
    }
    /**
     * Sets the allowMailForwarding property value. The allowMailForwarding property
     * @param value Value to set for the allowMailForwarding property.
     * @return a void
     */
    public void setAllowMailForwarding(@javax.annotation.Nullable final Boolean value) {
        this._allowMailForwarding = value;
    }
    /**
     * Sets the decryptionRightsManagementTemplateId property value. The decryptionRightsManagementTemplateId property
     * @param value Value to set for the decryptionRightsManagementTemplateId property.
     * @return a void
     */
    public void setDecryptionRightsManagementTemplateId(@javax.annotation.Nullable final String value) {
        this._decryptionRightsManagementTemplateId = value;
    }
}
