package com.microsoft.graph.models;

import com.microsoft.graph.models.InvokeUserFlowListener;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AuthenticationListener extends Entity implements Parsable {
    /** The priority of the listener. Determines the order of evaluation when an event has multiple listeners. The priority is evaluated from low to high. */
    private Integer _priority;
    /** Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to. */
    private AuthenticationSourceFilter _sourceFilter;
    /**
     * Instantiates a new authenticationListener and sets the default values.
     * @return a void
     */
    public AuthenticationListener() {
        super();
        this.setOdataType("#microsoft.graph.authenticationListener");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationListener
     */
    @javax.annotation.Nonnull
    public static AuthenticationListener createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuthenticationListener currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("sourceFilter", (n) -> { currentObject.setSourceFilter(n.getObjectValue(AuthenticationSourceFilter::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the priority property value. The priority of the listener. Determines the order of evaluation when an event has multiple listeners. The priority is evaluated from low to high.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the sourceFilter property value. Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to.
     * @return a authenticationSourceFilter
     */
    @javax.annotation.Nullable
    public AuthenticationSourceFilter getSourceFilter() {
        return this._sourceFilter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the sourceFilter property value. Filter based on the source of the authentication that is used to determine whether the listener is evaluated. This is currently limited to evaluations based on application the user is authenticating to.
     * @param value Value to set for the sourceFilter property.
     * @return a void
     */
    public void setSourceFilter(@javax.annotation.Nullable final AuthenticationSourceFilter value) {
        this._sourceFilter = value;
    }
}
