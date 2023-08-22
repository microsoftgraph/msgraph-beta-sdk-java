package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventPresenter extends Entity implements Parsable {
    /**
     * Email address of the presenter.
     */
    private String email;
    /**
     * Identity information of the presenter.
     */
    private CommunicationsUserIdentity identity;
    /**
     * Other detail information of the presenter.
     */
    private VirtualEventPresenterDetails presenterDetails;
    /**
     * Instantiates a new virtualEventPresenter and sets the default values.
     */
    public VirtualEventPresenter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventPresenter
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventPresenter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenter();
    }
    /**
     * Gets the email property value. Email address of the presenter.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(CommunicationsUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("presenterDetails", (n) -> { this.setPresenterDetails(n.getObjectValue(VirtualEventPresenterDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity information of the presenter.
     * @return a communicationsUserIdentity
     */
    @jakarta.annotation.Nullable
    public CommunicationsUserIdentity getIdentity() {
        return this.identity;
    }
    /**
     * Gets the presenterDetails property value. Other detail information of the presenter.
     * @return a virtualEventPresenterDetails
     */
    @jakarta.annotation.Nullable
    public VirtualEventPresenterDetails getPresenterDetails() {
        return this.presenterDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeObjectValue("presenterDetails", this.getPresenterDetails());
    }
    /**
     * Sets the email property value. Email address of the presenter.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the identity property value. Identity information of the presenter.
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final CommunicationsUserIdentity value) {
        this.identity = value;
    }
    /**
     * Sets the presenterDetails property value. Other detail information of the presenter.
     * @param value Value to set for the presenterDetails property.
     */
    public void setPresenterDetails(@jakarta.annotation.Nullable final VirtualEventPresenterDetails value) {
        this.presenterDetails = value;
    }
}
