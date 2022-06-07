package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the identityGovernance singleton. */
public class EntitlementManagementSettings extends Entity implements Parsable {
    /** If externalUserLifecycleAction is BlockSignInAndDelete, the number of days after an external user is blocked from sign in before their account is deleted. */
    private Integer _daysUntilExternalUserDeletedAfterBlocked;
    /** One of None, BlockSignIn, or BlockSignInAndDelete. */
    private String _externalUserLifecycleAction;
    /**
     * Instantiates a new entitlementManagementSettings and sets the default values.
     * @return a void
     */
    public EntitlementManagementSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a entitlementManagementSettings
     */
    @javax.annotation.Nonnull
    public static EntitlementManagementSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagementSettings();
    }
    /**
     * Gets the daysUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is BlockSignInAndDelete, the number of days after an external user is blocked from sign in before their account is deleted.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDaysUntilExternalUserDeletedAfterBlocked() {
        return this._daysUntilExternalUserDeletedAfterBlocked;
    }
    /**
     * Gets the externalUserLifecycleAction property value. One of None, BlockSignIn, or BlockSignInAndDelete.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUserLifecycleAction() {
        return this._externalUserLifecycleAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EntitlementManagementSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("daysUntilExternalUserDeletedAfterBlocked", (n) -> { currentObject.setDaysUntilExternalUserDeletedAfterBlocked(n.getIntegerValue()); });
            this.put("externalUserLifecycleAction", (n) -> { currentObject.setExternalUserLifecycleAction(n.getStringValue()); });
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
        writer.writeIntegerValue("daysUntilExternalUserDeletedAfterBlocked", this.getDaysUntilExternalUserDeletedAfterBlocked());
        writer.writeStringValue("externalUserLifecycleAction", this.getExternalUserLifecycleAction());
    }
    /**
     * Sets the daysUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is BlockSignInAndDelete, the number of days after an external user is blocked from sign in before their account is deleted.
     * @param value Value to set for the daysUntilExternalUserDeletedAfterBlocked property.
     * @return a void
     */
    public void setDaysUntilExternalUserDeletedAfterBlocked(@javax.annotation.Nullable final Integer value) {
        this._daysUntilExternalUserDeletedAfterBlocked = value;
    }
    /**
     * Sets the externalUserLifecycleAction property value. One of None, BlockSignIn, or BlockSignInAndDelete.
     * @param value Value to set for the externalUserLifecycleAction property.
     * @return a void
     */
    public void setExternalUserLifecycleAction(@javax.annotation.Nullable final String value) {
        this._externalUserLifecycleAction = value;
    }
}
