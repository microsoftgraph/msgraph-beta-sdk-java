package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationListener extends Entity implements Parsable {
    /**
     * The priority of the listener. Determines the order of evaluation when an event has multiple listeners. The priority is evaluated from low to high.
     */
    private Integer priority;
    /**
     * Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to.
     */
    private AuthenticationSourceFilter sourceFilter;
    /**
     * Instantiates a new authenticationListener and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AuthenticationListener() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationListener
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationListener createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.invokeUserFlowListener": return new InvokeUserFlowListener();
            }
        }
        return new AuthenticationListener();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("sourceFilter", (n) -> { this.setSourceFilter(n.getObjectValue(AuthenticationSourceFilter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority of the listener. Determines the order of evaluation when an event has multiple listeners. The priority is evaluated from low to high.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the sourceFilter property value. Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to.
     * @return a authenticationSourceFilter
     */
    @jakarta.annotation.Nullable
    public AuthenticationSourceFilter getSourceFilter() {
        return this.sourceFilter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("sourceFilter", this.getSourceFilter());
    }
    /**
     * Sets the priority property value. The priority of the listener. Determines the order of evaluation when an event has multiple listeners. The priority is evaluated from low to high.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPriority(@jakarta.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the sourceFilter property value. Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to.
     * @param value Value to set for the sourceFilter property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSourceFilter(@jakarta.annotation.Nullable final AuthenticationSourceFilter value) {
        this.sourceFilter = value;
    }
}
