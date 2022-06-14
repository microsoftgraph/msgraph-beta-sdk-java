package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Mapping between an Android app permission and the action Android should take when that permission is requested. */
public class AndroidPermissionAction implements AdditionalDataHolder, Parsable {
    /** Type of Android permission action. Possible values are: prompt, autoGrant, autoDeny. */
    private AndroidPermissionActionType _action;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Android permission string, defined in the official Android documentation.  Example 'android.permission.READ_CONTACTS'. */
    private String _permission;
    /**
     * Instantiates a new androidPermissionAction and sets the default values.
     * @return a void
     */
    public AndroidPermissionAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidPermissionAction
     */
    @javax.annotation.Nonnull
    public static AndroidPermissionAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidPermissionAction();
    }
    /**
     * Gets the action property value. Type of Android permission action. Possible values are: prompt, autoGrant, autoDeny.
     * @return a androidPermissionActionType
     */
    @javax.annotation.Nullable
    public AndroidPermissionActionType getAction() {
        return this._action;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidPermissionAction currentObject = this;
        return new HashMap<>(2) {{
            this.put("action", (n) -> { currentObject.setAction(n.getEnumValue(AndroidPermissionActionType.class)); });
            this.put("permission", (n) -> { currentObject.setPermission(n.getStringValue()); });
        }};
    }
    /**
     * Gets the permission property value. Android permission string, defined in the official Android documentation.  Example 'android.permission.READ_CONTACTS'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPermission() {
        return this._permission;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("permission", this.getPermission());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Type of Android permission action. Possible values are: prompt, autoGrant, autoDeny.
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final AndroidPermissionActionType value) {
        this._action = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the permission property value. Android permission string, defined in the official Android documentation.  Example 'android.permission.READ_CONTACTS'.
     * @param value Value to set for the permission property.
     * @return a void
     */
    public void setPermission(@javax.annotation.Nullable final String value) {
        this._permission = value;
    }
}
