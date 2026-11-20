package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A complex type to store process rule data for a Win32 LOB app.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppProcessRule extends Win32LobAppRule implements Parsable {
    /**
     * Instantiates a new {@link Win32LobAppProcessRule} and sets the default values.
     */
    public Win32LobAppProcessRule() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppProcessRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Win32LobAppProcessRule}
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppProcessRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppProcessRule();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operationType", (n) -> { this.setOperationType(n.getEnumValue(Win32LobAppProcessOperationType::forValue)); });
        deserializerMap.put("processDisplayName", (n) -> { this.setProcessDisplayName(n.getStringValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the operationType property value. A list of possible operations for rules used to make determinations about whether an application is in-use based on process state.
     * @return a {@link Win32LobAppProcessOperationType}
     */
    @jakarta.annotation.Nullable
    public Win32LobAppProcessOperationType getOperationType() {
        return this.backingStore.get("operationType");
    }
    /**
     * Gets the processDisplayName property value. Indicates the display name for the process in the Intune admin console. Example: `Microsoft Word`.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessDisplayName() {
        return this.backingStore.get("processDisplayName");
    }
    /**
     * Gets the processName property value. Indicates the process name to be searched for on a managed device when enforcing a managed app. Example: `TestApp.exe`.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProcessName() {
        return this.backingStore.get("processName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("operationType", this.getOperationType());
        writer.writeStringValue("processDisplayName", this.getProcessDisplayName());
        writer.writeStringValue("processName", this.getProcessName());
    }
    /**
     * Sets the operationType property value. A list of possible operations for rules used to make determinations about whether an application is in-use based on process state.
     * @param value Value to set for the operationType property.
     */
    public void setOperationType(@jakarta.annotation.Nullable final Win32LobAppProcessOperationType value) {
        this.backingStore.set("operationType", value);
    }
    /**
     * Sets the processDisplayName property value. Indicates the display name for the process in the Intune admin console. Example: `Microsoft Word`.
     * @param value Value to set for the processDisplayName property.
     */
    public void setProcessDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processDisplayName", value);
    }
    /**
     * Sets the processName property value. Indicates the process name to be searched for on a managed device when enforcing a managed app. Example: `TestApp.exe`.
     * @param value Value to set for the processName property.
     */
    public void setProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("processName", value);
    }
}
