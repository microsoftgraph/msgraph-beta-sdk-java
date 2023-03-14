package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MessageEventType implements ValuedEnum {
    Received("received"),
    Sent("sent"),
    Delivered("delivered"),
    Failed("failed"),
    ProcessingFailed("processingFailed"),
    DistributionGroupExpanded("distributionGroupExpanded"),
    Submitted("submitted"),
    Delayed("delayed"),
    Redirected("redirected"),
    Resolved("resolved"),
    Dropped("dropped"),
    RecipientsAdded("recipientsAdded"),
    MalwareDetected("malwareDetected"),
    MalwareDetectedInMessage("malwareDetectedInMessage"),
    MalwareDetectedInAttachment("malwareDetectedInAttachment"),
    TtZapped("ttZapped"),
    TtDelivered("ttDelivered"),
    SpamDetected("spamDetected"),
    TransportRuleTriggered("transportRuleTriggered"),
    DlpRuleTriggered("dlpRuleTriggered"),
    Journaled("journaled"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MessageEventType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MessageEventType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "received": return Received;
            case "sent": return Sent;
            case "delivered": return Delivered;
            case "failed": return Failed;
            case "processingFailed": return ProcessingFailed;
            case "distributionGroupExpanded": return DistributionGroupExpanded;
            case "submitted": return Submitted;
            case "delayed": return Delayed;
            case "redirected": return Redirected;
            case "resolved": return Resolved;
            case "dropped": return Dropped;
            case "recipientsAdded": return RecipientsAdded;
            case "malwareDetected": return MalwareDetected;
            case "malwareDetectedInMessage": return MalwareDetectedInMessage;
            case "malwareDetectedInAttachment": return MalwareDetectedInAttachment;
            case "ttZapped": return TtZapped;
            case "ttDelivered": return TtDelivered;
            case "spamDetected": return SpamDetected;
            case "transportRuleTriggered": return TransportRuleTriggered;
            case "dlpRuleTriggered": return DlpRuleTriggered;
            case "journaled": return Journaled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
