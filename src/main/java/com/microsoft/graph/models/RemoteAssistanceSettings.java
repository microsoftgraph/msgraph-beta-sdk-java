package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RemoteAssistanceSettings extends Entity implements Parsable {
    /** Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false. */
    private Boolean _allowSessionsToUnenrolledDevices;
    /** The current state of remote assistance for the account. Possible values are: disabled, enabled. This setting is configurable by the admin. Remote assistance settings that have not yet been configured by the admin have a disabled state. Returned by default. Possible values are: disabled, enabled. */
    private RemoteAssistanceState _remoteAssistanceState;
    /**
     * Instantiates a new remoteAssistanceSettings and sets the default values.
     * @return a void
     */
    public RemoteAssistanceSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a remoteAssistanceSettings
     */
    @javax.annotation.Nonnull
    public static RemoteAssistanceSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteAssistanceSettings();
    }
    /**
     * Gets the allowSessionsToUnenrolledDevices property value. Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowSessionsToUnenrolledDevices() {
        return this._allowSessionsToUnenrolledDevices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RemoteAssistanceSettings currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowSessionsToUnenrolledDevices", (n) -> { currentObject.setAllowSessionsToUnenrolledDevices(n.getBooleanValue()); });
            this.put("remoteAssistanceState", (n) -> { currentObject.setRemoteAssistanceState(n.getEnumValue(RemoteAssistanceState.class)); });
        }};
    }
    /**
     * Gets the remoteAssistanceState property value. The current state of remote assistance for the account. Possible values are: disabled, enabled. This setting is configurable by the admin. Remote assistance settings that have not yet been configured by the admin have a disabled state. Returned by default. Possible values are: disabled, enabled.
     * @return a remoteAssistanceState
     */
    @javax.annotation.Nullable
    public RemoteAssistanceState getRemoteAssistanceState() {
        return this._remoteAssistanceState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowSessionsToUnenrolledDevices", this.getAllowSessionsToUnenrolledDevices());
        writer.writeEnumValue("remoteAssistanceState", this.getRemoteAssistanceState());
    }
    /**
     * Sets the allowSessionsToUnenrolledDevices property value. Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.
     * @param value Value to set for the allowSessionsToUnenrolledDevices property.
     * @return a void
     */
    public void setAllowSessionsToUnenrolledDevices(@javax.annotation.Nullable final Boolean value) {
        this._allowSessionsToUnenrolledDevices = value;
    }
    /**
     * Sets the remoteAssistanceState property value. The current state of remote assistance for the account. Possible values are: disabled, enabled. This setting is configurable by the admin. Remote assistance settings that have not yet been configured by the admin have a disabled state. Returned by default. Possible values are: disabled, enabled.
     * @param value Value to set for the remoteAssistanceState property.
     * @return a void
     */
    public void setRemoteAssistanceState(@javax.annotation.Nullable final RemoteAssistanceState value) {
        this._remoteAssistanceState = value;
    }
}
