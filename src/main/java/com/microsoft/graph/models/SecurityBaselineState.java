package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SecurityBaselineState extends Entity implements Parsable {
    /** The display name of the security baseline  */
    private String _displayName;
    /** The security baseline template id  */
    private String _securityBaselineTemplateId;
    /** The security baseline state for different settings for a device  */
    private java.util.List<SecurityBaselineSettingState> _settingStates;
    /** Security baseline compliance state  */
    private SecurityBaselineComplianceState _state;
    /** User Principal Name  */
    private String _userPrincipalName;
    /**
     * Instantiates a new securityBaselineState and sets the default values.
     * @return a void
     */
    public SecurityBaselineState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineState
     */
    @javax.annotation.Nonnull
    public static SecurityBaselineState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineState();
    }
    /**
     * Gets the displayName property value. The display name of the security baseline
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SecurityBaselineState currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("securityBaselineTemplateId", (n) -> { currentObject.setSecurityBaselineTemplateId(n.getStringValue()); });
            this.put("settingStates", (n) -> { currentObject.setSettingStates(n.getCollectionOfObjectValues(SecurityBaselineSettingState::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(SecurityBaselineComplianceState.class)); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the securityBaselineTemplateId property value. The security baseline template id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityBaselineTemplateId() {
        return this._securityBaselineTemplateId;
    }
    /**
     * Gets the settingStates property value. The security baseline state for different settings for a device
     * @return a securityBaselineSettingState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineSettingState> getSettingStates() {
        return this._settingStates;
    }
    /**
     * Gets the state property value. Security baseline compliance state
     * @return a securityBaselineComplianceState
     */
    @javax.annotation.Nullable
    public SecurityBaselineComplianceState getState() {
        return this._state;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("securityBaselineTemplateId", this.getSecurityBaselineTemplateId());
        writer.writeCollectionOfObjectValues("settingStates", this.getSettingStates());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the displayName property value. The display name of the security baseline
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the securityBaselineTemplateId property value. The security baseline template id
     * @param value Value to set for the securityBaselineTemplateId property.
     * @return a void
     */
    public void setSecurityBaselineTemplateId(@javax.annotation.Nullable final String value) {
        this._securityBaselineTemplateId = value;
    }
    /**
     * Sets the settingStates property value. The security baseline state for different settings for a device
     * @param value Value to set for the settingStates property.
     * @return a void
     */
    public void setSettingStates(@javax.annotation.Nullable final java.util.List<SecurityBaselineSettingState> value) {
        this._settingStates = value;
    }
    /**
     * Sets the state property value. Security baseline compliance state
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final SecurityBaselineComplianceState value) {
        this._state = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
