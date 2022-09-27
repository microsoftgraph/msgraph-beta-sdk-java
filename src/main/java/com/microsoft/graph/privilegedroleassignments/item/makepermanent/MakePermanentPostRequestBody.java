package com.microsoft.graph.privilegedroleassignments.item.makepermanent;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the makePermanent method. */
public class MakePermanentPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The reason property */
    private String _reason;
    /** The ticketNumber property */
    private String _ticketNumber;
    /** The ticketSystem property */
    private String _ticketSystem;
    /**
     * Instantiates a new makePermanentPostRequestBody and sets the default values.
     * @return a void
     */
    public MakePermanentPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a makePermanentPostRequestBody
     */
    @javax.annotation.Nonnull
    public static MakePermanentPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MakePermanentPostRequestBody();
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
        final MakePermanentPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
            this.put("ticketNumber", (n) -> { currentObject.setTicketNumber(n.getStringValue()); });
            this.put("ticketSystem", (n) -> { currentObject.setTicketSystem(n.getStringValue()); });
        }};
    }
    /**
     * Gets the reason property value. The reason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the ticketNumber property value. The ticketNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketNumber() {
        return this._ticketNumber;
    }
    /**
     * Gets the ticketSystem property value. The ticketSystem property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketSystem() {
        return this._ticketSystem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("ticketNumber", this.getTicketNumber());
        writer.writeStringValue("ticketSystem", this.getTicketSystem());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the ticketNumber property value. The ticketNumber property
     * @param value Value to set for the ticketNumber property.
     * @return a void
     */
    public void setTicketNumber(@javax.annotation.Nullable final String value) {
        this._ticketNumber = value;
    }
    /**
     * Sets the ticketSystem property value. The ticketSystem property
     * @param value Value to set for the ticketSystem property.
     * @return a void
     */
    public void setTicketSystem(@javax.annotation.Nullable final String value) {
        this._ticketSystem = value;
    }
}
